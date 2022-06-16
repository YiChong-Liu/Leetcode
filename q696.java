public class q696 {

    /*public int countBinarySubstrings(String s) {
        int res = 0; // how many valid substrings
        int start = 0, end = 0;


        while(start < s.length() - 1) {
            end = start;
            int count = 0;
            while(end < s.length()) {
                if(end >= 2 && (end - start) >= 2) {
                    if(s.charAt(end) == '0' && s.charAt(end - 1) == '1' && s.charAt(end - 2) =='0' ){
                        break;
                    }
                    else if (s.charAt(end) == '1' && s.charAt(end - 1) == '0' && s.charAt(end - 2) =='1' ){
                        break;
                    }
                }
                if(s.charAt(end) == '0') {
                    count += 1;
                }
    
                if(s.charAt(end) == '1') {
                    count -= 1;
                }

                if(count == 0) {
                    // System.out.println(s.substring(start, end + 1));
                    res++;
                    break;
                }
                end++;
            }
            start++;
        }
        return res;
    }*/

    public int countBinarySubstrings(String s) {
        int c=0;
        int curr=1,h=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)) curr++;
            else{
                h=curr;
                curr=1;
            }
            if(h>=curr) c++;
        }
        return c;
    }
    public static void main(String[] args) {
        q696 sol = new q696();
        System.out.println(sol.countBinarySubstrings("00010111"));
    }
}
