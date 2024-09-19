import java.util.Scanner;

class customer{

    public int customer_ID;
    public String name;
    public String address;
    public String phoneNumber;


    public customer(int customer_ID,String name,String address,String phoneNumber){

        this.customer_ID=customer_ID;
        this.name=name;
        this.address=address;
        this.phoneNumber=phoneNumber;


    }

    public void display(){
        System.out.println();
    }
}

class account{

    public int accountNumber;
    public double balance;    
    public String account_type;
    
    public account(int accountNumber,double balance,String account_type){

        this.accountNumber=accountNumber;
        this.balance=balance;
        this.account_type=account_type;
        
    }

    public double deposit(double add_amount){
        balance+=add_amount;
            return balance;

    }

    public double withdraw(double remove){
        return balance-remove;


    }

    public void dis(){
        System.out.println("Account Number: "+ accountNumber+"\nBalance: "+balance+"\nType: "+account_type);
    }
}

class cheacking_account extends account{
public double interest;

public cheacking_account(int accountNumber,double balance,String account_type){

super(accountNumber,balance, account_type);
}

public void display(){
System.out.println("Showing the current balance: "+ balance);

    }
}
class saving_account extends account{
    public double interest_rate;
    public saving_account(int accountNumber,double balance,String account_type,double interest_rate){
        super(accountNumber,balance, account_type);
        this.interest_rate=interest_rate;
    }

    public void balance(){
        super.dis();
        System.out.println(balance*0.03);
    }
}
public class online_banking_system{
    public static void main (String [] args){
        String type;
        Scanner sc = new Scanner(System.in);
        System .out .println("Account Type:");
        type=sc.nextLine();

        customer cus = new customer(1839,"Raduan Ahamed","Uttara 18","012555556666");
        account acon = new account(1814,23000,"Savings plus Account");
        saving_account save= new saving_account(2,55,type,0.03);
        cheacking_account cheack = new cheacking_account(3,555,"Savings");
        acon.dis();
        
        if(type =="saving"){
            save.balance();
        }
        else if (type == "cheaking"){
            cheack.display();
        }

        System.out.println("Deposite in my account: "+acon.deposit(500));
        System.out.println("After Withdrawing: "+acon.withdraw(1000) );



    }


}