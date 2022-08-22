
import java.util.*;
public class q974 {
    public int subarraysDivByK(int[] nums, int k) {
        
        int len = nums.length;
        int sum = 0;
        int remainder = 0;
        int total = 0;
        
        HashMap <Integer, Integer> res = new HashMap<>();
        res.put(0,1);
        
        for(int i = 0; i < len; i++) {
            sum += nums[i];
            remainder = sum % k;
            if(remainder < 0) {
                remainder += k;
            }
            
            if(res.containsKey(remainder)) {
                total += res.get(remainder);
            }
            res.put(remainder, res.getOrDefault(remainder,0) + 1);
        }
        return total;
    }
}
