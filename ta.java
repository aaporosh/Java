class M {
    int i = 51;

    public M(int j) {
        System.out.println(i); // Print the value of 'i' from class M
        this.i = j * 10; // Update 'i' with the value passed as 'j' multiplied by 10
    }
}

class N extends M {
    public N(int j) {
        super(j); // Call the constructor of class M with 'j' as the argument
        System.out.println(this.i); // Print the value of 'i' from class N
        this.i = j + 20; // Update 'i' with the value of 'j' plus 20
    }
}

public class ta {
    public static void main(String[] args) {
        N n = new N(26); // Create an instance of class N with 'j' as 26
        System.out.println(n.i); // Print the final value of 'i' from class N
    }
}