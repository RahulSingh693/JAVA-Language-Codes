import java.util.Scanner;

public class Methodov {
    void multiply(){
        System.out.println("Multiple = "+69*69);
    }
    void multiply(int a,int b)
    {
        System.out.println("Multiple = "+a*b);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Methodov m = new Methodov();
        m.multiply();
        m.multiply(69, 69);
    }
}
