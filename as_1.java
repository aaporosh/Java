class person{
    public int age;
    public String name;
    public person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class as_1 {
    public static void main(String[] args) {
        person per = new person("Md Abir Ahmed ", 21);
        System.out.println("Name of person :"+per.getName());
        System.out.println("Age of person : "+per.getAge());
    }
}
