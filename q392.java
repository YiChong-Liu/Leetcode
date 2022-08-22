public class q392 {
     // iterate through the string s and check whether its
    // characters are in string t and have correct order
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")) {
            return true;
        }
        if(s.length() > t.length()) {
            return false;
        }
        char []t2 = t.toCharArray();
        int index = 0;
        for(int i = 0; i < t2.length; i++) {
            if(t2[i] == s.charAt(index)) {
                t2[index] = s.charAt(index);
                index++;
            }
            if(index >= s.length()) {
                return true;
            }
        }
        return false;
    }
}
