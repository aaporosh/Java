class University {
    String name;
    String location;

    public University(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void display() {
        System.out.println("University name: " + name + "\nLocation: " + location);
    }
}

class Canteen {
    String name;
    int table;
    int item;

    public Canteen(String name, int table, int item) {
        this.name = name;
        this.table = table;
        this.item = item;
    }

    public void display() {
        System.out.println("Canteen name: " + name + "\nFood Item: " + item + "\nNumber of tables: " + table);
    }
}

public class Diu extends University {
    String fac;
    String dept;
    int stu;
    Canteen can;

    public Diu(String name, String location, String fac, String dept, int stu, Canteen can) {
        super(name, location);
        this.fac = fac;
        this.dept = dept;
        this.stu = stu;
        this.can = can;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Faculty name: " + fac + "\nDepartment name: " + dept + "\nNumber of students: " + stu);
        can.display();
    }

    public static void main(String[] args) {
        Canteen c = new Canteen("Green garden", 10, 5);
        Diu d = new Diu("Diu University", "Some Location", "First", "CSE", 2000, c);
        d.display();
      
    }
}
