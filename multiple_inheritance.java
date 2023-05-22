import java.util.Scanner;

interface temp {
    float pi = 3.14f;
    void circum(float x);
}
class rectangle {
    float len, br;

    void data(float x, float y) {
        len = x;
        br = y;
    }
    void perimeter() {
        System.out.println("Perimeter of rectangle = " + 2 * (len + br));
    }
}
class circle extends rectangle implements temp {
    float circu;

    public void circum(float rad) {
        circu = 2 * pi * rad;
    }
    void display() {
        perimeter();
        System.out.println("Circumference of circle = " + circu);
    }
}
public class multiple_inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length & breadth: ");
        float len = sc.nextFloat();
        float br = sc.nextFloat();
        circle c = new circle();
        c.data(len, br);
        System.out.print("Enter radius: ");
        float rad = sc.nextFloat();
        c.circum(rad);
        c.display();
    }
}