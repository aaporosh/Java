class animal{
    void anim(){
        System.out.println("They are in method");
    }
}
public class ani extends animal {
    void dog(){
        super.anim();
        System.out.println("They are also animal");
    }
    public static void main(String[] args) {
        ani obj = new ani();
        obj.dog();
    }
}
