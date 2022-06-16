public class q344 {
    
    public void reverseString(char[] s) {
        for(int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
    public static void main(String[] args) {
        q344 sol = new q344();
        char []s = {'H', 'e', 'l', 'l', 'o'};
        sol.reverseString(s);
        for(char sub : s) {
            System.out.println(sub);
        }
    }
}
