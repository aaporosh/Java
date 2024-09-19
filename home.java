 abstract class animal {
    public abstract void eat();
    public abstract void move();
    public void life(){
        System.out.println("They are alive now ");
    }
}
class Human extends animal {
     public  void eat(){
        System.out.println("Human eat rice,meat and so on");
     }
    public void move(){
        System.out.println("They moves with Bus,Train");
    }
    public void talk(){
        System.out.println("Talk with various language");
    }
}
class Lion extends animal {
     public  void eat(){
        System.out.println("Lion only eat meat");
     }
    public void move(){
        System.out.println("Move like a hunter");
    }
    public void hunt (){
        System.out.println();
    }
}
class Bird extends animal {
     public  void eat(){
        System.out.println();
     }
    public void move(){
        System.out.println();
    }
    public void fly(){
        System.out.println("Bird can fly");
    }
}
public class home {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        Lion  l = new Lion();
        Bird b= new Bird();
        b.fly();
        b.life();
    }
}
