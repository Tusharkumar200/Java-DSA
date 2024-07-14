import java.util.ArrayList;

public class _GFG_boundary_traversel {
    public static void main(String[] args) {
        
    }
    void traverselLeft(Node root , ArrayList<Integer> result){
        if(root == null) return;

        if(root.left == null && root.right == null){
            result.add(root.data);
            return;
        }
        traverselLeft(root.left, result);
        traverselLeft(root.right, result);
      }

      void traverseLeft(Node root , ArrayList<Integer> result){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        
        
        }
      }
    
      ArrayList <Integer> boundary(Node node){

      }
}

public class Node{
    
    int data;
    Node left, right;

    Node(int data){
         this.data =data;
        left = right = null;
    }

}
