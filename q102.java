
import java.util.List;
import java.util.ArrayList;
public class q102 {
    List<List<Integer>> res = new ArrayList<>();
    // pre-order: Root => Left => Right
    // in-order: Left => Root => Right
    // post-order: Left => Right => Root
    
    // recursively go through the level and add integers to the res
    public void levelTraverse(TreeNode node, int level) {
        // dynamically adjust the size of res based on level
        if(res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(node.val);
        //recursion
        if(node.left != null) {
            levelTraverse(node.left, level + 1);
        }
        if(node.right != null) {
            levelTraverse(node.right, level + 1);
        }
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) {
            return res;
        }
        
        levelTraverse(root, 0);
        return res;
    }
}
