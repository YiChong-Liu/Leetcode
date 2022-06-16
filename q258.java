public class q258 {

    public int addDigits(int num) {
        while (num >= 10) {
            int temp = num;
            num = 0;
            while (temp > 0) {
                num += (temp % 10);
                temp = (temp - temp % 10) / 10;
            }
        }

        return num;
    }

    public static void main(String[] args) {
        q258 sol = new q258();
        int num = 38;
        System.out.println(sol.addDigits(num));
    }
}