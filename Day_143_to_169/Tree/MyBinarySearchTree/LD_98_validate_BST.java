package Tree.MyBinarySearchTree;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val){
        this.val = val;
    }

    public String toString(){
        return "value = "+ this.val;
    }
}

public class LD_98_validate_BST {

        private boolean validateBST(TreeNode root , long min , long max){
        if(root == null) return true;

        if(root.val <=min || root.val >= max) return false;

        return validateBST(root.left , min , root.val) && 
                validateBST(root.right , root.val , max);
    }
    public boolean isValidBST(TreeNode root){
        return validateBST(root,Long.MIN_VALUE , Long.MAX_VALUE);
    }
}
