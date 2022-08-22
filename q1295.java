public class q1295 {

    // Given an array nums of integers
    // return how many of them contain an even number of digits.

    public int findNumbers(int[] nums) {
        int total = 0;
        for(int sub : nums) {
            if(countDigits(sub) % 2 == 0) {
                total++;
            }
        }
        return total;
    }
    
    public int countDigits(int num) {
        int digit = 0;
        while(num > 0) {
            num /= 10;
            digit++;
        }
        return digit;
    }
    public static void main(String[] args) {
        q1295 sol = new q1295();
        int []nums = {12, 13, 14, 123, 124, 234};
        System.out.println(sol.findNumbers(nums));
    }
}
