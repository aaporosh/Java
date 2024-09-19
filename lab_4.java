import java.util.Scanner;

interface bank{   
    public void details();
    public void balance();
}
class account implements bank{   //using implements by calling interface
    public String name,id;
    double b;
    account(String name,String id,double b){  //constructor
        this.name=name;
        this.id=id;
        this.b=b;
    }
    public void details(){          // methods
        System.out.println("Client's name :"+name);
        System.out.println("Client's ID :"+id);
    }
    public void balance(){
       System.out.println("Current balance : "+b);
    }
}
class SavingsAccount implements bank{        //using implements by calling interface
    public String name,id;
    double b,d;
     SavingsAccount(String name,String id,double b,double d){   //constructor
        this.name=name;
        this.id=id;
        this.b=b;
        this.d =d;
    }
    public void details(){     // methods
        System.out.println("Client's name :"+name);
        System.out.println("Client's ID :"+id);
    }
    public void balance(){
       System.out.println("Current balance : "+(b+d));
    }
}
public class lab_4 {
    public static void main(String[] args) {
        String n,i;
        double b,d;
        Scanner sc = new Scanner(System.in);           //scanner class using for input
        System.out.print("Enter the name of client : ");
        n= sc.nextLine();
        System.out.print("Enter the Id of client : ");
        i= sc.nextLine();
        System.out.print("The balance of your account : ");
        b= sc.nextDouble();
        System.out.print("Additional balance : ");
        d= sc.nextDouble();
        System.out.println();
        account acc = new account(n, i, b);    //object creation
        acc.details();              //calling methods
        System.out.println();
        System.out.println("Balance Statement");
        acc.balance();
        SavingsAccount save = new SavingsAccount(n, i, b, d);
        save.balance();
    }
    
}
