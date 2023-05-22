public class String_class {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Rahul ");
        char ch[] = {'s','i','n','g','h'};
        String s3 = new String(ch);

        s2 = s2.concat(s3);
        System.out.println(s2.substring(6));
        System.out.println(s1.charAt(0));
        System.out.println(s1.toUpperCase()+" "+s2);
    }
}
