import java.util.HashMap;

public class map {
   public static void main(String[] args) {

    HashMap<Integer,String> m = new HashMap<Integer,String>();

    m.put(12,"Abir" );
    m.put(24, "Rafi");

    System.out.println(m.get(24));
    System.out.println(m);
   } 
}
