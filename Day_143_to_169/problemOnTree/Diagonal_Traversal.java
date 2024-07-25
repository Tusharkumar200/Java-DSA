import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = right = null;
    
    }
}

public class Diagonal_Traversal {
    public ArrayList <Integer> diagonal(Node root)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null) return result;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        while (q.isEmpty()) {
            Node current = q.poll();

            while(current != null){
                result.add(current.data);

                if(current.left != null){
                    q.offer(current.left);
                }
                current = current.right;
            }
        }
        return result;
    }
}
