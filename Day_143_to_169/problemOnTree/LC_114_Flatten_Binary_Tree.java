

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){}
    public TreeNode(int val){this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }


}

public class LC_114_Flatten_Binary_Tree {
    public void flatten(TreeNode root){
        
        TreeNode current = root;

        while(current != null){
            
            if(current.left != null){
                    TreeNode pred = current.left;
                    while(pred.right != null){
                        pred = pred.right;
                    }
                    if(pred.right == null){
                        //Temp Link
                        pred.right = current.right;
                        current.right = current.left;
                        current.left = null;
                        current = current.right;
                    }
            }
            else{
                current = current.right;
            }
        }
    }
}
