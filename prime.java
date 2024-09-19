public class prime {
    int prime_num(){
        int c=0;
        for(int i=2;;i++){
            int k=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    k=1;
                    break;
                }
            }
            if(k==0){
                System.out.print(i+" ");
                c++;
            }
            if(c==100){
                break;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        prime num = new prime();
        num.prime_num();
    }
}
