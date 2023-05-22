import java.util.*;

public class table {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int i = 1;
        System.out.print("Enter number: ");
        int num = s.nextInt();

        do {
            System.out.println(num + " x " + i + " = " + num * i);
            i++;
        } while (i < 11);
        s.close();
    }
}
