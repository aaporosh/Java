class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }
    public void printDetails(){
        System.out.println("My Lion's name : "+getName()+"\nAge is :"+getAge());
    }
}
class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }
    public void printDetails(){
        System.out.println("My Elephant's name : "+getName()+"\nAge is :"+getAge());
    }
}

public class anim {
    public static void main(String[] args) {
        Lion l = new Lion("Jaggu", 10);
        l.printDetails();
        System.out.println();
        Elephant e=new Elephant("Jontu", 12);
        e.printDetails();
    }
    
}
