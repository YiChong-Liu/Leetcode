
import java.util.Arrays;

public class q910 {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length;
        int res = nums[len - 1] - nums[0];
        for(int i = 0; i < nums.length - 1; i++) {
            int high = Math.max(nums[len - 1] - k, nums[i] + k);
            int low = Math.min(nums[0] + k, nums[i + 1] - k);
            res = Math.min(res, high - low);
        }
        return res;
    }
}
