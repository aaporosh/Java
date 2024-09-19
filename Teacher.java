class School {
  int id = 1620;
   void printID() {
    System.out.println("School ID: " + this.id);
  }
}

public class Teacher extends School {
  int id = 1830;

  void printID() {
    System.out.println("Teacher's ID : " + this.id);
    super.printID();
  }

  public static void main(String[] args) {
    Teacher ob = new Teacher();
    ob.printID();
  }
}
