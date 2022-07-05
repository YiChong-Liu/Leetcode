
import java.util.List;
import java.util.ArrayList;

public class q78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

        for(int num : nums) {
            List<List<Integer>> each = new ArrayList<>();
            for(List<Integer> sub : res) {
                each.add(new ArrayList<Integer>(sub){{add(num);}});
                System.out.println(each);
            }

            for(List<Integer> sub : each) {
                res.add(sub);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        q78 sol = new q78();
        int []nums = {3,4,5};
        System.out.println(sol.subsets(nums));
    }
}
