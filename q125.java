public class q125 {

    public boolean isPalindrome(String s) {
        char[] data = new char[s.length()];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                data[index++] = (char) (s.charAt(i) + 32);
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                data[index++] = (char) (s.charAt(i));
            }else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                data[index++] = (char) (s.charAt(i));
            }
        }

        /*
         * for(char sub: data) {
         * System.out.print(sub);
         * }
         * System.out.println();
         */
        // abababa
        // abba
        for (int j = 0; j < index / 2; j++) {
            if (data[j] != data[index - j - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        q125 sol = new q125();
        System.out.println(sol.isPalindrome("0p"));
    }
}
