abstract class bankaccount {

    public abstract double deposit();
    public abstract double withdraw();
    public abstract double getBalance();
}

class saving_account extends bankaccount{
    private double balance;
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double deposit(double amount){
        return balance =(amount+balance);
    }
    public  double withdraw(double amount){
        return balance =(balance-amount);
    }
    public double getBalance(){
        return balance;
    }
}
class checking_account extends bankaccount{
    private double balance;
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double deposit(){

    }
    public  double withdraw(){

    }
    public double getBalance(){
        return balance;
    }
}
public class bank {
    
}
