public class Sum_Tree_or_Not {
    Pair isSumTreeSolver(Node root){
        
            if(root  == null) return new Pair(true, 0);
            if(root.left == null && root.right == null) return new Pair(true,root.data);

            Pair left = isSumTreeSolver(root.left);
            if(!left.isSumTree) return left;
            
            Pair right = isSumTreeSolver(root.right);
            if(!right.isSumTree) return right;
            
            return new Pair(left.sum + right.sum == root.data , left.sum + right.sum + root.data);
             
    }
    
    boolean isSumTree(Node root ){
        return isSumTreeSolver(root).isSumTree;
    }
}


 class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

class Pair{
    boolean isSumTree;
    int sum;

    public Pair(boolean isSumTree , int sum){
        this.isSumTree = isSumTree;
        this.sum = sum;
    }
}                                                                                                                                                           


