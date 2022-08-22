public class q35 {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }
    
    public int binarySearch(int[] nums, int target, int left, int right) {
        if(left > right) {
            return left;
        }
        int mid = (left + right) / 2;
        // System.out.println(left + " " + mid + " " + right);
        if(nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, right);
        }
        else if(nums[mid] > target){
            return binarySearch(nums, target, left, mid - 1);
        }
        return mid;
    }
}
