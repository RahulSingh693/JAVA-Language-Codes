class AgeException extends Exception {
    public void print() {
        System.out.println("Incorrect age");
    }
}

public class A_exception_throws {

    int age;
    public A_exception_throws(int age) {
        this.age = age;
    }
    public void check() {
        try {
            if (age > 18 && age > 60)
                throw new AgeException();
            System.out.println("Correct age");

        } catch (AgeException e) {
            e.print();
        }
    }
    public static void main(String[] args) {
        int age = 61;
        A_exception_throws a = new A_exception_throws(age);
        a.check();
    }
    // static void method() throws ArithmeticException
    // {
    // System.out.println("Inside the method()");
    // throw new ArithmeticException("throwing ArithmeticException");
    // }
    // public static void main(String args[])
    // {
    // try
    // {
    // method();
    // }
    // catch(ArithmeticException e)
    // {
    // System.out.println(e);
    // System.out.println("caught in main() method");
    // }
    // }
}
