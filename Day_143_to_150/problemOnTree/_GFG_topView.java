import java.util.ArrayList;

class Node{
    
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = right = null;
    
    }
}

public class Pair{
    Node node;
    int x;

    pubic Pair(Node node, int x){
        this.node = node;
        this.x = x;
    }
}

public class _GFG_topView{
    
    static ArrayList<Integer> topView(Node root){
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null) return result;
        
        Map<Integer , Integer> ma 
    }
    
    
    
}