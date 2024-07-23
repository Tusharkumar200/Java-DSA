
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Lc_235_LCA_in_BST {
    public TreeNode lowestCommonAncestor(TreeNode root , TreeNode p ,TreeNode q){
        if(root == null) return null;
         if(root == p || root == q) return root;

         if(p.val < root.val && q.val < root.val){
             return lowestCommonAncestor(root.left, p, q);
         }

         if(p.val > root.val && q.val > root.val){
             return lowestCommonAncestor(root.right, p, q);
         }

         return root;
    }
}
