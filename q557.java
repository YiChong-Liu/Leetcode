public class q557 {

    public String reverseWords(String s) {
        String res = "";
        String []str = s.split(" ");
        for(int i = 0; i < str.length; i++) {
            char []c = str[i].toCharArray();
            reverseString(c);
            str[i] = new String(c);
            res += str[i];
            if(i != str.length - 1){
                res += " ";
            }
        }   
        return res;
    }

    public void reverseString(char[] s) {
        for(int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        q557 sol = new q557();
        String res = sol.reverseWords(s);
        System.out.println(res);
    }
}
