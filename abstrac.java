abstract class simple {
    simple() {
        System.out.println("Constructor called.");
    }
    abstract void print();
    void display() {
        System.out.println("Non-abstract method called.");
    }
}

class inherit extends simple {
    void print() {
        System.out.println("Abstract method called.");
    }
}

public class abstrac {
    public static void main(String[] args) {
        simple obj = new inherit();
        obj.print();
        obj.display();
    }
}
