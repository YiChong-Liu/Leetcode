public class q389 {

    public char findTheDifference(String s, String t) {
        char res = ' ';
        for(int i = 0; i < t.length(); i++) {
            if(s.indexOf(t.charAt(i)) == -1) {
                res = t.charAt(i);
            }
        }
        return res;
    }


    public static void main(String[] args) {

    }
}
