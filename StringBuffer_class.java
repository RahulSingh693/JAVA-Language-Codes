public class StringBuffer_class {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Example");
        s1.append(" Program");
        System.out.println(s1);
        s1.insert(0, "Java ");
        System.out.println(s1);
        s1.replace(4, 4, " Language");
        System.out.println(s1);
        s1.delete(12, 20);
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);
    }
}
