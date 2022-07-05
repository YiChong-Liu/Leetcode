public class q26 {
    // duplicate elements are ajacent
    // iterative solution
    // go through the array, if find an duplicate
    // remove it and shift all the elements behind by one
    
    public int removeDuplicates(int[] nums) {
        
        
        int len = nums.length;
        int front = 0;
        int back = 1;
        while( back < len) {
      
            if(nums[front] < nums[back]) {
                front++;
                nums[front] = nums[back];

            } 
            back++;
        }
        return front + 1;
    }
}
