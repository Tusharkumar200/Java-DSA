
public class Sum_Tree_or_Not {
    boolean isSumTree(Node root ){
        
    }
}

public class Node{
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


