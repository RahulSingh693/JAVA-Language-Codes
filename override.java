import java.util.Scanner;

class first {
    Scanner sc = new Scanner(System.in);
    String s1;
    first() {
        System.out.print("Enter the first name: ");
        s1 = sc.nextLine();
    }
    void print() {
        System.out.print(" " + s1);
    }
}
class second extends first {
    String s2;
    second() {
        System.out.print("Enter the last name: ");
        s2 = sc.nextLine();
    }
    void print() {
        super.print();
        System.out.print(" " + s2);
    }
}
public class override {
    public static void main(String[] args) {
        second obj = new second();
        System.out.print("Your full name is");
        obj.print();
    }
}
