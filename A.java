public class A {
    public int a,b;
    public int sum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }
    static int sum(int a,int b ,int c){
        int sum =a+b+c;
        System.out.println(sum);
        return sum;
    }
    static double sum (double a ,double b){
        double sum =a+b;
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        A a1 =new A();
        a1.sum(5,6);
        sum(5,6,7);
        sum(3.4,5.5);
    }
}
