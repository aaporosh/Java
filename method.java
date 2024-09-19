class java{
    public int k = 10;

}
public class method {
    private int a =9;
    private void m(){
        System.out.println("Hello Java");
    }
    public static void main(String[] args) {
        method obj = new method();
        System.out.println(obj.a);
        obj.m();
        java ob = new java();
        System.out.println(ob.k);
    }
} 

