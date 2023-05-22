import java.util.Scanner;

class area {
    static float calc(float x,float y) {
        return Float.parseFloat("0.5")*x*y;
    }
}

public class static_class {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter height and base: ");
        float h = s.nextFloat();
        float b = s.nextFloat();

        System.out.println("Area of triangle = "+area.calc(h,b)+" sq. unit");
        s.close();
    }
}
