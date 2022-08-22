
import java.util.List;
import java.util.ArrayList;

public class q144 {
    // first add the root val
    // and recursively add the val of left child
    // and recursively add the val of right child

    public List<Integer> preorderTraversal(TreeNode root) {
        List <Integer> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        res.add(root.val);
        List <Integer> left = preorderTraversal(root.left);
        res.addAll(left);
        List <Integer> right = preorderTraversal(root.right);
        res.addAll(right);  
        return res;
    }
}
