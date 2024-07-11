

public class Node{
    
    int data;
    Node left, right;

    Node(int data){
         data = data;
        left = right = null;
    }

}

public class Balanced_Tree_or_Not {

    public int getHeight(Node root){
        if(root == null) return 0;

      return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
    
   boolean  isBalanced(Node root){
        if(root == null ) return true;
        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);

       int  myBalanceFactor = Math.abs(getHeight(root.left) - getHeight(root.right));
    
       if(left && right && muBalaceFactor <= ) return true;
       return false;

    }
}
