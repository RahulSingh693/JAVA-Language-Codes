import java.util.*;

public class rectangle {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter length & breadth: ");
        float l = s.nextFloat();
        float b = s.nextFloat();
        System.out.println("Area = "+l*b);
        s.close();
    }
}
