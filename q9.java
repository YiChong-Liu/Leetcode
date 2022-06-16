public class q9 {

    public boolean isPalindrome(int x) {
        if(x == 0) {
            return true;
        }
        else if (x < 0 || x % 10 == 0) {
            return false;
        }


        int res = 0;
        while (res < x) {
            res = res * 10 + x % 10;
            x /= 10;
        }

        // even and odd number
        return x == res || x == res / 10;
    }

    public static void main(String[] args) {
        q9 sol = new q9();
        int x = 0;
        System.out.println(sol.isPalindrome(x));
    }
}
