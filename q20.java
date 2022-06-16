import java.util.Stack;
public class q20 {

    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if((s.charAt(i) == '(' || s.charAt(i) =='[') || s.charAt(i) == '{' ) {
                st.push(s.charAt(i));
            }else if((s.charAt(i) == ')' && !st.empty() && st.peek() == '(')) {
                st.pop();
            }else if(s.charAt(i) == ']' && !st.empty() && st.peek() == '[') {
                st.pop();
            }else if(s.charAt(i) == '}' && !st.empty() && st.peek() == '{') {
                st.pop();
            }else {
                return false;
            }
        }

        return st.empty();
    } 

    public static void main(String[] args) {
        String s = "{}{}";
        q20 sol = new q20();
        System.out.println(sol.isValid(s));
    }
}
