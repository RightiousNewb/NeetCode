package Trees;

public class ReverseTree {
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

    private void swapChildren(TreeNode node){
        if(node == null || (node.right == null && node.left == null)){
            return;
        }else{
            TreeNode temp = node.right;
            node.right = node.left;
            node.left = temp;
            if(node.left != null){
                swapChildren(node.left);
            }
            if(node.right != null){
                swapChildren(node.right);
            }
            
        }
        


    }
    public TreeNode invertTree(TreeNode root) {
        TreeNode node = root;
        swapChildren(node);
        return root;
    }
}
