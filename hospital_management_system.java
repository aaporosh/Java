
import java.util.*;

class hospital{
    
    String name;
    String address;
    hospital(String name , String address){
        this.name=name;
        this.address=address;
    }
}
class employee{
    int Id;
    String name;
    String designation;
    double salary;
    employee(int id , String name,String designation,double salary){
        this.Id=id;
        this.name=name;
        this.designation=designation;
        this.salary=salary;
    }
}
public class hospital_management_system {
    public static void main(String[] args) {
        ArrayList<hospital> h = new ArrayList<>();
        ArrayList<employee> e = new ArrayList<>();

        hospital h1 =new hospital("Square Hospitals Ltd.","Pallabi, Mirpur");
        hospital h2 = new hospital("United Hospital Limited.","Gulshan-2, Dhaka");
        hospital h3 = new hospital("Ibne Sina", "Banani");

        h.add(h1);
        h.add(h2);
        h.add(h3);


       for(hospital ha :h){
            System.out.println(ha.name+" "+ha.address);
        }
        System.out.println();

        employee e1 = new employee(1951,"Rafi","Nurse",15000);
        employee e2 = new employee(1830,"Riddy","Physician",13000);
        employee e3 = new employee(1839, "Raduan", "Nurse", 14000);
        
        e.add(e1);
        e.add(e2);
        e.add(e3);

        for(employee ea :e){
            System.out.println(ea.Id+" "+ea.name+" "+ea.designation+" "+ea.salary);
        }
        System.out.println();

        e.remove(e3);
         for(employee ea :e){
            System.out.println(ea.Id+" "+ea.name+" "+ea.designation+" "+ea.salary);
        }

    }
}
