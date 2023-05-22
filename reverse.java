import java.util.Scanner;

public class reverse {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int rev = 0;
        System.out.print("Enter Number: ");
        int num = s.nextInt();

        do{
            rev = rev*10 + num % 10;
            num /= 10;
        }while(num > 0);
        System.out.println("Reverse Number = "+rev);
        s.close();
    }
}