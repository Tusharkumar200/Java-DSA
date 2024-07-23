// leetcode 230  question number
// Difficulty: Medium
// Problem Link: https://leetcode.com/problems/kth-smallest-element-in-a-bst/
import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Kth_Smallest_in_BST {

    private void inorder(TreeNode root, List<Integer> result){
        if(root != null){
            inorder(root.left, result);
            result.add(root.val);
            inorder(root.right, result);
        }
    }

    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result.get(k-1);
    }
    
    
}