
 class Node{
        int data;
        Node left;
        Node right;

        Node(int d){
            this.data = d;
            left = right = null;
        }
 }

public class Check_If_Binary_Tree_is_a_Valid_Max_Heap{
  
    private int totalNodes(Node root){

        if(root == null) return 0;

        return 1 + totalNodes(root.left) + totalNodes(root.right);
    }
    boolean isHeap(Node tree){
        if(tree == null) return null;

        int totalNodes = totalNodes(tree);

        return isCBT() && isMaxTree();
    }



}