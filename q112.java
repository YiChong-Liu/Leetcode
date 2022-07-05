public class q112 {
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return false;
        }
        // root is a leaf node (no children) => check if targetSum is 0
        if(root.left == null && root.right == null) {
            return targetSum == root.val;
        }  
        // recursively search through the left/right subtree and compute, if one of them is true (targetSum is finally 0), return true
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    public static void main(String[] args) {
        
    }
}
