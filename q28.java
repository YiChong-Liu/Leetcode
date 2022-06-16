public class q28 {
    public int strStr(String haystack, String needle) {

        if (haystack.length() < needle.length()) {
            return -1;
        }

        // when needle is an empty string
        if (needle == "") {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            boolean judge = true;
            if (needle.charAt(0) == haystack.charAt(i) && ((haystack.length() - i) >= needle.length())) {
                for (int j = 1; j < needle.length(); j++) {
                    if (needle.charAt(j) != haystack.charAt(i + j)) {
                        judge = false;
                        break;
                    }
                }
                if (judge) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        q28 sol = new q28();
        String a = "mississippi", b = "issip";
        System.out.println(sol.strStr(a, b));
    }
}
