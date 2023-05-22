public class Solution {
    public static void main(String[] args) {
        boolean ans=false;
        String s = "abc", t = "ahbdgc";
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(j) )
                j++;
            if (j == s.length() - 1 && (t.charAt(i) == s.charAt(j)))
              ans=true;
        }
        System.out.println(ans);
    }
}