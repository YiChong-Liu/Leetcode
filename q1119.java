public class q1119 {

    public String removeVowels(String s) {
        String str = "aeiou";
        String res = "";
        for(int i = 0; i < s.length(); i++) {
            if(str.indexOf(s.charAt(i)) != -1) {
                res += s.charAt(i);
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        
    }
}
