abstract class parent{
    public void n(){
        System.out.println("hello");
    }
    abstract public void ka();
}
class child extends parent{
    public void ka(){
        System.out.println("Hello in this abstraction");
    }
}
public class abs {
    public static void main(String[] args) {
        child c = new child();
        c.ka();
        c.n();
    }
}
