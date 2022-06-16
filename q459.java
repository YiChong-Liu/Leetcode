public class q459 {

    public boolean repeatedSubstringPattern(String s) {
        String s2 = s + s;
        System.out.println(s2.substring(1, s2.length() - 1));
        return s2.substring(1, s2.length() - 1).contains(s);
    }

    public static void main(String[] args) {
        q459 sol = new q459();
        System.out.println(sol.repeatedSubstringPattern("abcabc"));
    }
}
