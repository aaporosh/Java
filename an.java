class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    public void display() {
        System.out.println(name + " is my dog's name!");
    }
}
class Reptile extends Animal {
    public Reptile(String name, int age) {
        super(name, age);
    }

    public void display() {
        System.out.println(name+ " is very cool snake!");
    }
}
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    public void dis() {
        System.out.println(name+ " is flying.");
    }
}

public class an{
    public static void main(String[] args) {
        Mammal m= new Mammal("Tomy", 5);
        Reptile r= new Reptile("Cobra", 2);
        Bird b= new Bird("Blue Falcon", 3);

        m.display();
        m.sleep();
        System.out.println();
        r.display();
        r.sleep();
        System.out.println();
        b.dis();
    }
}