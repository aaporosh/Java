interface ani{
   public void details();
   public void behave();
}
 class dog implements ani {     //using implements by calling interface
    public String name;
    public int age;
    dog(String name,int age){  //constructor
       this.name=name;
       this.age=age;
    }
    public void details(){    // methods
        System.out.println("The name of the dog : "+name);
        System.out.println("Dog's age : "+age);
    }
   public void behave(){
    System.out.println("!! vow vow !!");
    }
}
 class cat implements ani{
    public String name;
    public int age;
    cat(String name,int age){  //constructor
       this.name=name;
       this.age=age; 
    }
    public void details(){    // methods
        System.out.println("The name of the cat is : "+name);
        System.out.println("Cat's age : "+age);
    }
   public void behave(){
    System.out.println("!! meaw meaw !!");
    }
}
public class animal{
    public static void main(String[] args) {
        dog d = new dog("Alex",8);   //object creation
        cat c = new cat("Mena",5);        
        d.details();  //calling methods
        d.behave();
        System.out.println();
        c.details();
        c.behave();
    }
}