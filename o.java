
class B{
    void display(){
        System.out.println(" Inside Class B");
    }
}
class C extends B {
        void display(){
        System.out.println("Inside Class C and Out of Class B and A");
        }
    }

public class o{
    public static void main(String[] args){
        B b= new C();
        b.display();
    }
}

