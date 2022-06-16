public class q680 {
    
    /*public boolean validPalindrome(String s) {
        if(!checkPalindrome(s)) {
            for(int i = 0; i < s.length(); i++) {
                String sub = null;
                if(i == 0) {
                    sub = s.substring(1);
                } else if(i == s.length() - 1) {
                    sub = s.substring(0, s.length() - 1);
                } else {
                    sub = s.substring(0, i) + s.substring(i + 1, s.length());
                }
                // System.out.println(sub);
                if(checkPalindrome(sub)) {
                    return true;
                }
            }
            return false;
        }
        else {
            return true;
        }
    }*/

    public boolean checkPalindrome(String s) {
        for(int i = 0; i < s.length() / 2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // q680 sol = new q680();
        //System.out.println(sol.validPalindrome("abaaaaaaaaaaabaaaaa"));
    }
}
