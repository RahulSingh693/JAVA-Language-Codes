import java.util.*;
public class factorial {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();
        int fib = 1;
        for(int i = num;i > 1;i--){
            fib *= i;
        }
        System.out.println("Factorial = "+fib);
        s.close();
    }
}
