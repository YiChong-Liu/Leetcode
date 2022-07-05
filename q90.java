import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// Backtrack + DFS
public class q90 {
    List<List<Integer>> res;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // so the duplicate elements will be placed together
        Arrays.sort(nums);
        res = new ArrayList<>();
        dfs(nums, new ArrayList<Integer>(), 0);
        return res;    
    }

    public void dfs(int []nums, ArrayList<Integer>sub, int index) {
        res.add(new ArrayList<>(sub));
        for(int i = index; i < nums.length; i++) {
            // Avoid duplication!
            if(i != index && nums[i] == nums[i - 1]) {
                continue;
            }
            sub.add(nums[i]);
            dfs(nums, sub, i + 1);
            sub.remove(sub.size() - 1);
        }
    }
    public static void main(String[] args) {
        q90 sol = new q90();
        int []nums = {1, 1};
        System.out.println(sol.subsetsWithDup(nums));   
    }
}
