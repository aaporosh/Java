  class A {  
     String str = "Hello,using super keyword";
     void message() {
      System.out.println("Inside class A");      
     }  
  }
  class B extends A {   
     String str = "using this keyword";
     void print() {
       super.message();
       System.out.println(super.str); 
       System.out.println(this.str); 
    }   
    public static void main(String [] args) {
      B obj = new B();  
      obj.print();      
    }
 }