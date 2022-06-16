public class q69 {

    public int mySqrt(int x) {
        if(x == 0) {
            return 0;
        }
        int res = 0;
        for(int i = 1; i <= x / i; i++) {
            if(i <= x / i && (i + 1) > x / (i + 1)){
                res = i;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        q69 sol = new q69();
        System.out.println(sol.mySqrt(2147395600));
    }
}
