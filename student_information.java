import java.util.*;

class student{
    public String name;
    public String dept;
    public double cgpa;

    public student(String name,String dept,double cgpa){
        this.name=name;
        this.dept= dept;
        this.cgpa=cgpa;
    }
}
public class student_information {
    public static void main(String[] args) {
        HashMap<Integer,student> stu = new HashMap<Integer,student>();

        student s1 = new student("Rafi", "CSE", 4.00);
        student s2 = new student("Mahtab", "NFE", 3.79);
        student s3 = new student("Tawfek", "CSE", 4.00);
        student s4 = new student("Raduan", "CSE", 3.60);

        stu.put(1951, s1);
        stu.put(1608, s2);
        stu.put(1827, s3);

        for(Map.Entry<Integer,student> s: stu.entrySet()){
            int key = s.getKey();
            student sa = s.getValue();
            System.out.println("Student ID : "+key+"\nName of Student :"+sa.name+"\nDepartment :"+sa.dept+"\nResult :"+sa.cgpa);
            System.out.println();
        }

       stu.replace(1608, s2, s4);
       
        System.out.println("After replacing \n");
       for(Map.Entry<Integer,student> s: stu.entrySet()){
            int key = s.getKey();
            student sa = s.getValue();
            System.out.println("Student ID : "+key+"\nName of Student :"+sa.name+"\nDepartment :"+sa.dept+"\nResult :"+sa.cgpa);
            System.out.println();
        }

        stu.remove(1827);

        System.out.println("After removing \n");
        
        for(Map.Entry<Integer,student> s: stu.entrySet()){
            int key = s.getKey();
            student sa = s.getValue();
            System.out.println("Student ID : "+key+"\nName of Student :"+sa.name+"\nDepartment :"+sa.dept+"\nResult :"+sa.cgpa);
            System.out.println();
        }
    }
}
