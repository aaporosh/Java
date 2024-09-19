class v{
    int x=100;
}
public class su extends v{
    int x=50;
    void dis(){
        System.out.println(x);
    }
    void display(){
        System.out.println(super.x);
    }
    public static void main(String[] args) {
        su obj = new su();
        obj.dis();
        System.out.println("After using super keyword");
        obj.display();
    }
}
