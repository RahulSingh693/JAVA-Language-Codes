import java.util.*;

class Fun {
    public int n1, n2;
    Scanner s = new Scanner(System.in);

    public Fun() {
        System.out.print("First Number: ");
        n1 = s.nextInt();
        System.out.print("Second Number: ");
        n2 = s.nextInt();
        System.out.println("Two numbers: " + n1 + " " + n2);
    }
}

public class Constr {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Fun obj = new Fun();
        s.close();
    }
}
