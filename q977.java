import java.util.Arrays;

public class q977 {

   // Given an integer array nums sorted in non-decreasing order, 
   // return an array of the squares of each number sorted in non-decreasing order.


    public int[] sortedSquares(int[] nums) {
        int []res = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            res[i] = nums[i] * nums[i];
        }
        Arrays.sort(res);
        return res;
    }

    public static void main(String[] args) {
        q977 sol = new q977();
        int []nums = {-4,-1,0,3,10};
        nums = sol.sortedSquares(nums);
        for(int sub : nums) {
            System.out.print(sub + " ");
        }
        System.out.println();
    }
}
