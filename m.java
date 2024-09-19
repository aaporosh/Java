class animal{
    String name;
    int age;
    public animal(String name , int age){
        this.name =name;
        this.age=age;
    }
}
class Mammal extends animal {
   public Mammal(String name ,int age){
    super(name, age);
   }
   void display(){
        System.out.println("Name of this Animal :"+name+"\nAge of this Animal"+age);
        System.out.println();
    }
}
class Reptile extends animal{
    public Reptile(String name ,int age){
    super(name, age);
   }
   void display(){
    super.display();
   }
}
class Bird extends animal{
    public Bird(String name ,int age){
    super(name, age);
   }
   void display(){
    super.display();
   }
}
public class m {
    Mammal m = new Mammal("Dog", 5);
    m.display();
}
