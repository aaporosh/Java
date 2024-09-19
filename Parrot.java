class Birds {

  int age;

  Birds(int age) {
    this.age = age;
    System.out.println("Birds class's constructor!");
  }
}

public class Parrot extends Birds {

  String name;

  Parrot(String name, int age) {
    super(age);
    this.name = name;
    System.out.println("Parrot class's constructor!");
  }

  void printDetails() {
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
  }

  public static void main(String[] args) {
    Parrot ob = new Parrot("Uzi", 5);
    ob.printDetails();
  }
}
