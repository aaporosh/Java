import java.util.Scanner;

public class BankAccount {
    String accountnumber,accountholder;
        double balance,add,rem;
   public double deposit(double balance,double add){
        return balance+add;
    }
    public double withdraw(double balance ,double rem){
        return balance-rem;
   }
   public double getBalance(double balance){
        return balance;
   }

    public static void main(String[] args) {
        String accountnumber,accountholder;
        double balance,add,rem;
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter your Account number :");
        accountnumber = sc.nextLine();
        System.out.print("your name :");
        accountholder = sc.nextLine();
        BankAccount bank = new BankAccount();
        System.out.println("Account number :"+accountnumber+"\nAccount Holder :"+accountholder);
        System.out.println("Balance after deposit :"+  bank.deposit(34000, 2300));
        System.out.println("balance after withdraw :"+bank.withdraw(34000, 5000));
    }
}
