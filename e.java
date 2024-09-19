public class e {

    private void ml() {
        m2();

        System.out.printf("11");

    }

    private void m2() {
        m3();

        System.out.printf("22");

    }

    private void m3(){

        System.out.printf("33");

        try {
        int sum  = 4/0;

        System.out.printf("44");}

        catch(ArithmeticException ea){
            System.out.printf("55");
        }catch(Exception e){

            System.out.printf("66");}

        finally{

                System.out.printf("77");}

        System.out.printf("88");}

    public static void main(String[] args){

    e obj = new e();

        obj.ml();
}}