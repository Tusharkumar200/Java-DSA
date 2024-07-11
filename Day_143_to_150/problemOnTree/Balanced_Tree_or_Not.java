

public class Node{
    
    int data;
    Node left, right;

    Node(int data){
         this.data =data;
        left = right = null;
    }

}

class Pair{
    boolean isBalanced;
    int height;
    
    public Pair(boolean isBalanced , int height){
        this.isBalanced = isBalanced;
        this.height = height;
    }
}

public class Balanced_Tree_or_Not {

    public int getHeight(Node root){
        if(root == null) return 0;

      return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    // using Pair to reduce time complexcity.

    boolean isBalancedFast(Node root){
        if(root == null) return new Pair(true, 0);
        Pair left = isBalancedFast(root.left);
        Pair right = isBalancedFast(root.right);

        int myBalanceFactor = Math.abs(left.height - right.height);
        int myHight =  Math.max(left.height , right.height) + 1;
        if(left.isBalanced && right.isBalanced && myBalanceFactor <= 1){
            return new Pair(true , myHight);
        }

        return new Pair(false, myHight);

    }
    
   boolean  isBalanced(Node root){
    //     if(root == null ) return true;
    //     boolean left = isBalanced(root.left);
    //     boolean right = isBalanced(root.right);

    //    int  myBalanceFactor = Math.abs(getHeight(root.left) - getHeight(root.right));
    
    //    if(left && right && muBalaceFactor <= ) return true;
    //    return false;

    // after applying Pair 
    return isBalancedFast(root).isBalanced;

    }
}
