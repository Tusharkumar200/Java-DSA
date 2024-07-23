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
    public int i=1;
    private int optimizeWay(TreeNode root,  int k){
        if(root == null) return -1;
        
        int left = optimizeWay(root.left, k);
        if(left != -1) return left;

        if(k==i) return root.val;

        i++;
        return optimizeWay(root.right, k);
    }

    // inorder traversal of BST gives sorted order of elements
    private void inorder(TreeNode root, List<Integer> result , int k){
        if(root != null){
            inorder(root.left, result ,k);
            result.add(root.val);
            if(result.size() == k) return;
            inorder(root.right, result ,k) ;
        }
    }

    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        // inorder(root, list,k );
        // return list.get(k-1);

        return optimizeWay(root, k);
    }
    
    
}