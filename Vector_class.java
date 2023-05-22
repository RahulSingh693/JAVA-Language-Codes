import java.util.*;

public class Vector_class {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>(10);
        vec.add(19);
        vec.add(65);
        vec.addElement(91);
        vec.addElement(48);
        System.out.println(vec.capacity());
        System.out.println(vec.elementAt(2));

        if (vec.isEmpty())
            System.out.println("Empty");
        else
            System.out.println("No Empty");
            
        vec.removeElementAt(0);
        Collections.sort(vec);
        vec.setElementAt(49, 2);
        System.out.println("Vector: " + vec);
        System.out.println(vec.contains(49));
    }
}