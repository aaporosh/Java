import java.util.*;
import java.util.Scanner;

class Student {
    private String Id;
    private String mobileNumber;
    private boolean isCompleted;

    public Student(String Id, String mobileNumber) {
        this.Id = Id;
        this.mobileNumber = mobileNumber;
        this.isCompleted = false;
    }

    public String getId() {
        return Id;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return "Student ID: " + Id + ", Mobile Number: " + mobileNumber + ", Completed: " + isCompleted;
    }
}

public class student_management{
    private ArrayList<Student> students;

    public student_management() {
        this.students = new ArrayList<>();
    }

    public void registerStudent(String Id, String mobileNumber) {
        students.add(new Student(Id, mobileNumber));
        System.out.println("Student registered successfully.");
    }

    public Student searchStudent(String query) {
        for (Student student : students) {
            if (student.getId().equals(query) || student.getMobileNumber().equals(query)) {
                return student;
            }
        }
        return null; // Return null if no student is found
    }

    public void markStudentCompleted(String Id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId().equals(Id)) {
                student.markCompleted();
                System.out.println("Student marked as completed.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void displayAllStudents() {
        System.out.println("All Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public static void main(String[] args) {
       student_management system = new student_management();
        Scanner scanner = new Scanner(System.in);

        // Example: Register students
        system.registerStudent("1839", "01734567890");
        system.registerStudent("1951", "0136543210");

        // Example: Search for a student
        System.out.print("Enter student ID or mobile number to search: ");
        String searchQuery = scanner.nextLine();
        Student foundStudent = system.searchStudent(searchQuery);
        if (foundStudent != null) {
            System.out.println("Student found: " + foundStudent);
        } else {
            System.out.println("Student not found.");
        }

        // Example: Mark a student as completed
        System.out.print("Enter student ID to mark as completed: ");
        String studentIdToComplete = scanner.nextLine();
        system.markStudentCompleted(studentIdToComplete);
        

        // Example: Display all students
        system.displayAllStudents();
    }
}
