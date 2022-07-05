
import java.util.ArrayList;
import java.util.List;

public class q94 {
    List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root != null) {
            if(root.left != null) {
                inorderTraversal(root.left);
            }
            res.add(root.val);
            if(root.right != null) {
                inorderTraversal(root.right);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
