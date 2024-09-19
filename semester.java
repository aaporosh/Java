import java.util.*;


class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name+"\n";
    }
}

class sem {
    private int semesterId;
    private String name;
    private double fees;
    private boolean isAvailable;

    public sem(int semesterId, String name, double fees, boolean isAvailable) {
        this.semesterId = semesterId;
        this.name = name;
        this.fees = fees;
        this.isAvailable = isAvailable;
    }

    public int getSemesterId() {
        return semesterId;
    }

    public String getName() {
        return name;
    }

    public double getFees() {
        return fees;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Semester ID: " + semesterId + " Name: " + name + ", Fees: " + fees + ", Available: " + isAvailable;
    }
}

class Enrollment {
    private Student student;
    private sem semester;
    private Date dueDate;
    private double lateFee;

    public Enrollment(Student student, sem semester, Date dueDate, double lateFee) {
        this.student = student;
        this.semester = semester;
        this.dueDate = dueDate;
        this.lateFee = lateFee;
    }

    public Student getStudent() {
        return student;
    }

    public sem getSemester() {
        return semester;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public double getLateFee() {
        return lateFee;
    }

    public boolean isLate() {
        Date currentDate = new Date();
        return currentDate.after(dueDate);
    }

    @Override
    public String toString() {
        return "Enrollment Details - " + student + "\n" + semester + ", Due Date: " + dueDate + ", Late Fee: " + lateFee;
    }
}

public class semester {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("1608", "Mahtab Khan");
        Student student2 = new Student("1827", "Tawfek");

        // Create semesters
        sem semester1 = new sem(1, "Spring 2023", 1000.0, true);
        sem semester2 = new sem(2, "Fall 2023", 1200.0, true);

        // Create enrollments
        Enrollment enrollment1 = new Enrollment(student1, semester1, new Date(), 50.0);
        Enrollment enrollment2 = new Enrollment(student2, semester2, new Date(), 0.0);

        // Display enrollment details
        System.out.println(enrollment1);
        System.out.println("Is late: " + enrollment1.isLate());

        System.out.println(enrollment2);
        System.out.println("Is late: " + enrollment2.isLate());
    }
}
