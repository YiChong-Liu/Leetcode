
import java.util.*;
public class q637 {
    List<List<Integer>> data = new ArrayList<>();
    List<Double> res = new ArrayList<>();
    
    // first go through each level using recursion, and count the average of each level
    
    // recursion
    public void levelTraverse(TreeNode node, int level) {
        if(data.size() == level) {
            data.add(new ArrayList<>());
        }
        data.get(level).add(node.val);
        if(node.left != null) {
            levelTraverse(node.left, level + 1);
        }
        if(node.right != null) {
            levelTraverse(node.right, level + 1);
        }
    }
    
    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null) {
            return res;
        }
        levelTraverse(root, 0);
        for(List<Integer> sub : data) {
            double sum = 0.0;
            double num = 0;
            for(int sub2 : sub) {
                num++;
                sum += sub2;
            }
            res.add(sum / num);
        }
        return res;
    }
}
