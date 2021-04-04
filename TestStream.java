package Streams;

import static Streams.StreamMethods.*;
import static Streams.StudentsList.*;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

public class TestStream {

    ArrayList<Students> arrayList = new ArrayList<>();

    @Before
    public void setUp() {
        addStudents();
    }

    @Test
    public void test_listByFaculty() {
        arrayList.add(st1);
        arrayList.add(st2);
        arrayList.add(st8);
        List<Students> actual = listByFaculty("Экономический");
        List<Students> expected = arrayList;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_listByEachFacultyAndCourse() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        listByEachFacultyAndCourse();
        Assert.assertEquals("Исторический: {6-й=[Student{id: 103, firstName: Дмитрий, lastName: Дмитрук, yearOfBirth: 1996, address: Киевская 45, telephone: 07325695465, faculty: Исторический, course: 6-й, group: Ист-61}], 2-й=[Student{id: 110, firstName: Наталья, lastName: Цар, yearOfBirth: 2001, address: Техническая 55, telephone: 0732568421, faculty: Исторический, course: 2-й, group: Ист-22}]}\r\n" +
                    "Экономический: {5-й=[Student{id: 101, firstName: Александр, lastName: Мосийчук, yearOfBirth: 1998, address: Полевая 60А, telephone: 0956278968, faculty: Экономический, course: 5-й, group: Екр-52}, Student{id: 102, firstName: Сергей, lastName: Могилев, yearOfBirth: 1998, address: Столичная 30, telephone: 0952365945, faculty: Экономический, course: 5-й, group: Екр-52}], 1-й=[Student{id: 108, firstName: Андрей, lastName: Сорокин, yearOfBirth: 2002, address: Житомирская 23, telephone: 0739911021, faculty: Экономический, course: 1-й, group: Екр-12}]}\r\n" +
                    "Химический: {4-й=[Student{id: 107, firstName: Татьяна, lastName: Савицкая, yearOfBirth: 1999, address: Солнечная 1, telephone: 0955555887, faculty: Химический, course: 4-й, group: Хим-41}], 5-й=[Student{id: 104, firstName: Карина, lastName: Щавлинская, yearOfBirth: 1998, address: Шевченка 2, telephone: 0669265481, faculty: Химический, course: 5-й, group: Хим-52}, Student{id: 105, firstName: Анастасия, lastName: Чернолуцкая, yearOfBirth: 1999, address: Калины 9, telephone: 0509563899, faculty: Химический, course: 5-й, group: Хим-52}]}\r\n" +
                    "Биологический: {3-й=[Student{id: 106, firstName: Денис, lastName: Черкашин, yearOfBirth: 2000, address: Воли 98, telephone: 0996322214, faculty: Биологический, course: 3-й, group: Био-33}, Student{id: 109, firstName: Роман, lastName: Лабин, yearOfBirth: 2000, address: Центральная 13, telephone: 0500011224, faculty: Биологический, course: 3-й, group: Био-31}]}", output.toString().trim());
        System.setOut(null);
    }

    @Test
    public void test_listByYearOfBirth() {
        arrayList.add(st8);
        arrayList.add(st10);
        List<Students> actual = listByYearOfBirth(2000);
        List<Students> expected = arrayList;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_oneByYearOfBirth() {
        arrayList.add(st5);
        List<Students> actual = oneByYearOfBirth(1998);
        List<Students> expected = arrayList;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_groupList() {
        List <String> expected = new ArrayList<>();
        expected.add("Александр Мосийчук");
        expected.add("Сергей Могилев");
        List<String> actual = groupList("Екр-52");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_amountOfStudents() {
        int expected = 2;
        int actual = (int) amountOfStudents("Исторический");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_changeFaculty() {
        changeFaculty("Екр-52", "Магический");
        String expected = "Магический";
        Assert.assertEquals(expected, st1.getFaculty());
        Assert.assertEquals(expected, st2.getFaculty());
    }

    @Test
    public void test_changeGroup() {
        changeGroup("Хим-52", "Хим-54");
        String expected = "Хим-54";
        Assert.assertEquals(expected, st4.getGroup());
        Assert.assertEquals(expected, st5.getGroup());
    }

    @Test
    public void test_findStudent () {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        findStudent("Хим-52");
        Assert.assertEquals("Optional[Student{id: 104, firstName: Карина, lastName: Щавлинская, yearOfBirth: 1998, address: Шевченка 2, telephone: 0669265481, faculty: Химический, course: 5-й, group: Хим-52}]", output.toString().trim());
        System.setOut(null);
    }
}
