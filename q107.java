import java.util.*;
public class q107 {
    List <List<Integer>> res = new ArrayList<>();
    public void levelTraverse(TreeNode node, int level) {
        if(res.size() == level) {
            res.add(new ArrayList<>());
        }
        
        res.get(level).add(node.val);
        if(node.left != null) {
            levelTraverse(node.left, level + 1);
        }
        if(node.right != null) {
            levelTraverse(node.right, level + 1);
        }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) {
            return res;
        }
        levelTraverse(root, 0);
        Collections.reverse(res);
        return res;
    }
}
