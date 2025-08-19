package Trees;

import java.util.HashMap;
import java.util.Stack;

public class MaxDepth {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    private int depthRemaining(TreeNode node, int count){
        if(node != null){
            count = count+1; //count each node
            return Math.max(depthRemaining(node.left, count), depthRemaining(node.right, count));
        } else{
            return count;
        }
        
        
    }
    public int maxDepth(TreeNode root) {
        int maxTravel = 0;
        TreeNode node = root;
        return depthRemaining(node,0);
    }
}
