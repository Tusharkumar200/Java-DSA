

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


public class LC_617_Merge_two_Binary_Trees {
    
    public TreeNode mergeTrees(TreeNode root1 , TreeNode root2){
        if(root1 == null) return root2;
        if(root2 == null) return root1;

        TreeNode node = new TreeNode(root1.val + root2.val);

        TreeNode left = mergeTrees(root1.left, root2.left);
        TreeNode right = mergeTrees(root1.right, root2.right);

        node.left = left;
        node.right = right;

        return node;
    }
}
