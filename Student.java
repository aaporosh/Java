interface Person {
    void display();
}

class Professor implements Person { //use implements for interface
    String name;
    int id;

    public Professor(String name, int id) {
        this.id = id;
        this.name = name;   //use this keyword
    }

    public void display() {
        System.out.println("Professor name: " + name + "\nID: " + id);
    }
}

class Department {
    String deptname;
    String address;

    public Department(String deptname, String address) {
        this.deptname = deptname; //over ridding
        this.address = address;
    }

    public void display() {
        System.out.println("Department name: " + deptname + "\nAddress: " + address);
    }
}

public class Student implements Person {
    String name;
    int id;
    Department deptinfo;   //refarence variable

    public Student(String name, int id, Department deptinfo) {
        this.name = name;   //over ridding
        this.id = id;
        this.deptinfo = deptinfo;
    }

    public void display() {
        System.out.println("Student's name: " + name + "\nStudent's Id: " + id);
        deptinfo.display();  // composition
    }

    public static void main(String[] args) {
        Department dept = new Department("CSE", "Asulia");
        Student std = new Student("Rahim Khan", 1814, dept);
        Professor pro = new Professor("Mehedi Hasan", 4568); //assosiation

        std.display();  // calling object
        System.out.println();
        pro.display();
    }
}
