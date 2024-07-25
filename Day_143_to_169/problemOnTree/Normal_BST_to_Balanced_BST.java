import java.util.ArrayList;
import java.util.List;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class Normal_BST_to_Balanced_BST {

    private void getInorder(Node root , List<Integer> list){
            if(root == null) return;

            getInorder(root.left , list);
            list.add(root.data);
            getInorder(root.right, list);
    }
    
    private Node solve(Node root, int start ,int end , List<Integer> inorder){
        if(start > end ) return null;

        int mid = (start + end) / 2;
        int num = inorder.get(mid);

        Node node = new Node(num);
        node.left = solve(start , mid -1 , inorder);
        node right = solve(mid + 1 , end ,inorder);
        return node;
    }
    
    Node buildBalancedTree(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        getInorder(root, list);
        return solve(0 , list.size() -1 , list);
    }
}
