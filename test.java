class Student {
    private int stuid;
    private String stuname;
    private double cgpa;

    public Student() {
    }

    public Student(int stuid, String stuname, double cgpa) {
        this.stuid = stuid;
        this.stuname = stuname;
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.println("Student ID: " + stuid);
        System.out.println("Student Name: " + stuname);
        System.out.println("CGPA: " + cgpa);
    }
}

class Course {
    private int courseCode;
    private String courseTitle;

    public Course() {
    }

    public Course(int courseCode, String courseTitle) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
    }

    public void display() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Title: " + courseTitle);
    }
}

class Registration {
    private Student student;
    private Course course;
    private String semester;
    private int year;

    public Registration(Student student, Course course, String semester, int year) {
        this.student = student;
        this.course = course;
        this.semester = semester;
        this.year = year;
    }

    public void display() {
        System.out.println("Registration Details:");
        System.out.println("Semester: " + semester);
        System.out.println("Year: " + year);
        System.out.println("Student Information:");
        student.display();
        System.out.println("Course Information:");
        course.display();
    }
}

public class test {
    public static void main(String[] args) {
        Student student = new Student(1, "Abir", 4.00);
        Course course = new Course(201, "OOP(java)");

        Registration registration = new Registration(student, course, "Fall", 2023);

        registration.display();
    }
}
