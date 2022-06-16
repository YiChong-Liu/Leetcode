public class q345 {

    // two pointer
    public String reverseVowels(String s) {
        char []c = s.toCharArray();
        String vowel = "aeiouAEIOU";
        int start = 0, end = c.length - 1;
        while(start < end) {
            if(vowel.indexOf(c[start]) == -1) {
                start++;
            }
            if(vowel.indexOf(c[end]) == -1) {
                end--;
            }
            if(vowel.indexOf(c[start]) != -1 && vowel.indexOf(c[end]) != -1) {
                char temp = c[start];
                c[start] = c[end];
                c[end] = temp;
                start++;
                end--;
            }
        }

        String res = String.valueOf(c);
        return res;
    }

    public static void main(String[] args) {
        q345 sol = new q345();
        String s = "leetcode";
        System.out.println(sol.reverseVowels(s));
    }
}
