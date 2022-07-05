
import java.util.List;
import java.util.ArrayList;


// DFS + backtrack
public class q78_2 {
    List<List<Integer>> res;

    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<List<Integer>>();
        dfs(nums, new ArrayList<Integer>(), 0);
        return res;
    }

    public void dfs(int []nums, List<Integer> sub, int index) {
        res.add(new ArrayList<>(sub));
        for(int i = index; i < nums.length; i++) {
            // add num[i] into the current subset
            sub.add(nums[i]);
            // recursively add more integers to the subset
            dfs(nums, sub, i + 1);
            // backtrack by remove num[i] from subset
            sub.remove(sub.size() - 1);
        }
    }

    public static void main(String[] args) {
        q78_2 sol = new q78_2();
        int []nums = {1, 2, 3};
        System.out.println(sol.subsets(nums));
    }
}