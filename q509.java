public class q509 {
    public int fib(int n) {
        if(n <= 1) {
            return n;
        }
        int []sequence = new int[n + 1];
        sequence[1] = 1;
        for(int i = 2; i <= n; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }
        return sequence[n];
    }
}
