package Streams;

import java.util.ArrayList;

public class StudentsList {

    public static Students st1 = new Students(101, "Александр", "Мосийчук", 1998, "Полевая 60А", "0956278968", "Экономический", "5-й", "Екр-52");
    public static Students st2 = new Students(102, "Сергей", "Могилев", 1998, "Столичная 30", "0952365945", "Экономический", "5-й", "Екр-52");
    public static Students st3 = new Students(103, "Дмитрий", "Дмитрук", 1996, "Киевская 45", "07325695465", "Исторический", "6-й", "Ист-61");
    public static Students st4 = new Students(104, "Карина", "Щавлинская", 1998, "Шевченка 2", "0669265481", "Химический", "5-й", "Хим-52");
    public static Students st5 = new Students(105, "Анастасия", "Чернолуцкая", 1999, "Калины 9", "0509563899", "Химический", "5-й", "Хим-52");
    public static Students st6 = new Students(106, "Денис", "Черкашин", 2000, "Воли 98", "0996322214", "Биологический", "3-й", "Био-33");
    public static Students st7 = new Students(107, "Татьяна", "Савицкая", 1999, "Солнечная 1", "0955555887", "Химический", "4-й", "Хим-41");
    public static Students st8 = new Students(108, "Андрей", "Сорокин", 2002, "Житомирская 23", "0739911021", "Экономический", "1-й", "Екр-12");
    public static Students st9 = new Students(109, "Роман", "Лабин", 2000, "Центральная 13", "0500011224", "Биологический", "3-й", "Био-31");
    public static Students st10 = new Students(110, "Наталья", "Цар", 2001, "Техническая 55", "0732568421", "Исторический", "2-й", "Ист-22");

    public static ArrayList<Students> listOfStudents = new ArrayList<Students>();

    public static void addStudents () {
        listOfStudents.add(st1);
        listOfStudents.add(st2);
        listOfStudents.add(st3);
        listOfStudents.add(st4);
        listOfStudents.add(st5);
        listOfStudents.add(st6);
        listOfStudents.add(st7);
        listOfStudents.add(st8);
        listOfStudents.add(st9);
        listOfStudents.add(st10);
    }
}
