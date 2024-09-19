
class student{
    private String name;
    private int Id;
    private double cgpa;

    public void setName(String name){
        this.name=name;
    }
    
    public void setId(int Id){
        this.Id =Id;
    }
    
    public void setCgpa(double cgpa){
        this.cgpa=cgpa;
    }
    
    public String getName(){
        return name;
    }
    public int getId(){
        return Id;
    }
    public double getCgpa(){
        return cgpa;
    }
        
}
public class myclass {
    public static void main(String[] args) {
        student s = new student();
        s.setName("Abir");
        s.setId(1814);
        s.setCgpa(3.66);
        System.out.println("Name of student : "+s.getName());
        System.out.println("Student's Id : "+s.getId());
        System.out.println("Result : "+s.getCgpa());
    }
}

