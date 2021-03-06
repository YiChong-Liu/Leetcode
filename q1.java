
class q1 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        q1 sol = new q1();

        int [] res = sol.twoSum(nums, 9);
        System.out.println(res[0] + " " + res[1]);
    }
}