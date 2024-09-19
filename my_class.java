class person{
    private String name;
    private int age;

   /*  public person(String name , int age){
        this.name=name;
        this.age=age;
    }*/
    public void setname(String name){
          this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setage(int age){
           this.age=age;
    }
    public int getage(){
        return age;
    }

}
public class my_class  {
   /*  public my_class(String name , int age){
        super(name, age);
    }*/
    public static void main(String[] args) {
        person m = new person();
        m.setname("Rahim");
        m.setage(12);
        System.out.println(m.getname());
        System.out.println(m.getage());
    }
}
