public class ex {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            float c = a/b;
            System.out.println("Result is "+c);
        }catch(Exception e){
            System.out.println("The exception is "+e);
        }
        finally{
            System.out.println("This program has an exception");
        }
    }
}
