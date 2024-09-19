import java.util.ArrayList;

class student  {
    private int Id;
    private String name ;
    private String semester;
    private double result;

    public  student(int Id,String name,String semester,double result){
        this.Id= Id;
        this.name= name;
        this.semester = semester;
        this.result = result;
    }
  

    public int getId(){
        return Id;
    }
    public String getName(){
        return name;
    }
    public String getSemester(){
        return semester;
    }
    public double getResult(){
        return result;
    }
}
public class sms {
    public static void main(String[] args) {
        ArrayList<student> stu = new ArrayList<student>();

        student s1 = new student(1608,"Mahtab Khan","Fall",3.89);
        student s2 = new student(1951, "Rafi", "Fall 2023", 2.96);

        stu.add(s1);
        stu.add(s2);

        for(student s  : stu){
            if(s.getResult() >= 3.00){
                System.out.println("Registration successfull for ");
                System.out.println("Student Id "+s.getId()+"\nName : "+s.getName()+"\nSemester : "+s.getSemester());
                System.out.println();
            }
            else{
                System.out.println("Registration Failed for ");
                System.out.println("Student Id "+s.getId()+"\nName : "+s.getName()+"\nSemester : "+s.getSemester());
            }
        }
    }
}
