package Streams;

public class Students {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final int yearOfBirth;
    private final String address;
    private final String telephone;
    private String faculty;
    private final String course;
    private String group;

    public Students (int id, String firstName, String lastName, int yearOfBirth, String address, String telephone, String faculty, String course, String group) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.telephone = telephone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public String getFaculty () {
        return faculty;
    }

    public int getId () {
        return id;
    }

    public String getFirstName () {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public int getYearOfBirth () {
        return yearOfBirth;
    }

    public String getAddress () {
        return address;
    }

    public String getTelephone () {
        return telephone;
    }

    public String getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public String setFaculty (String newFaculty) {
        this.faculty = newFaculty;
        return newFaculty;
    }

    public String setGroup (String newGroup) {
        return  this.group = newGroup;
    }

    @Override
    public String toString () {
        return "Student{" + "id: " + id + ", firstName: " + firstName + ", lastName: " + lastName + ", yearOfBirth: " + yearOfBirth + ", address: " + address + ", telephone: " + telephone + ", faculty: " + faculty + ", course: " + course + ", group: " + group + "}";
    }
}
