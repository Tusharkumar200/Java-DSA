
class TreeNode<T>{
    public T data;
    public TreeNode<T> left;
    public TreeNode<T> right;

    TreeNode(T data){
        this.data = data;
        left = right = null;
    }

}

class Pair{
    int min;
    int max;
    boolean isValidBST;
    int size;

    public Pair(){
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        isValidBST = true;
        size = 0;
    }
}
public class Largest_BST_in_Binary_Tree {
   
    private static Pair solve(TreeNode<Integer> root , int[] ans){
            if(root == null) return new Pair();

            Pair left = solve(root.left, ans);
            Pair right = solve(root.right, ans);

            Pair current = new Pair();

            current.min = Math.min(root.data , left.min);
            current.max = Math.max(root.data , right.max);
            current.size = left.size + right.size + 1;

            boolean isMeValid = left.max < root.data && right.min > root.data;

            if(left.isValidBST && right.isValidBST && isMeValid){
                current.isValidBST = true;

            }else{
                current.isValidBST = false;
            }

            if(current.isValidBST){
                ans[0] = Math.max(ans[0], current.size);
            }

            return current;
    }

    public static int largerstBTS(TreeNode<Integer> root){
        
        int[] ans = new int[]{ -1};
        solve(root, ans);
        return ans[0];
    }
}
