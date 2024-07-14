import java.util.ArrayList;

public class _GFG_boundary_traversel {
    public static void main(String[] args) {
        
    }
    void traverseLeaf(Node root , ArrayList<Integer> result){
        if(root == null) return;

        if(root.left == null && root.right == null){
            result.add(root.data);
            return;
        }
        traverseLeaf(root.left, result);
        traverseLeaf(root.right, result);
      }

      void traverseLeft(Node root , ArrayList<Integer> result){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        
        result.add(root.data);

        if(root.left != null){
            traverseLeft(root.left, result);

        }
        else{
            traverseLeft(root.right, result);
        }

      }
      
      void traverseRightRevOrder(Node root, ArrayList<Integer> result){
            if(root == null) return;
            if(root.left == null && root.right == null) return;

            if(root.right != null){
                traverseRightRevOrder(root.right, result);
    
            }
            else{
                traverseRightRevOrder(root.right, result);
            }
            result.add(root.data);

      }
      ArrayList <Integer> boundary(Node node){
        ArrayList<Integer> result = new ArrayList<>();
        if(node == null) return result;

        result.add(node.data); //Root
        traverseLeft(node.left, result); //Left
        traverseLeaf(node.left, result); //Leaf left
        traverseLeaf(node.right, result); //right left

        traverseRightRevOrder(node.right, result); //Right rev
        return result;

      }
}

 class Node{
    
    int data;
    Node left, right;

    Node(int data){
         this.data =data;
        left = right = null;
    }

}
