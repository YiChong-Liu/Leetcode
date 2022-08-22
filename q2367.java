public class q2367 {
     // start with an element, and then increase diff, check if it's in the array
     public int arithmeticTriplets(int[] nums, int diff) {
        // edge case
        if(nums == null) {
            return 0;
        }
        int res = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            int count = 2;
            int scalar = 1;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] == (scalar * diff) + nums[i]) {
                    count--; 
                    scalar++;
                    if(count == 0 && scalar == 3) {
                        res++;
                        count = 2;
                        scalar = 1;
                    }
                    continue;
                }
            }
        }
        return res;
    }
}
