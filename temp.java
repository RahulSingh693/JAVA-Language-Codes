import java.util.*;

class temp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature Unit(F/C): ");
        char temp = sc.next().charAt(0);

        if (temp == 'F' || temp == 'f') {
            System.out.print("Enter Fahreinheit: ");
            int f = sc.nextInt();
            System.out.print("Celcius : " + (f - 32) * 5 / 9);
        } else if (temp == 'C' || temp == 'c') {
            System.out.print("Enter Celcius: ");
            int c = sc.nextInt();
            System.out.print("Fahreinheit: " + (9 * c / 5 + 32));
        } else
            System.out.print("Invalid entry!");
        
            sc.close();
    }
}