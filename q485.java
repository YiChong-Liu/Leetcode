public class q485 {
    
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLength = 0;
        int length = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                length++;
                if(length > maxLength) {
                    maxLength = length;
                }
            }
            else {
                length = 0;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        q485 sol = new q485();
        int []nums = {1,0,1,1,0,0,1,1,1};
        System.out.println(sol.findMaxConsecutiveOnes(nums));
    }
}
