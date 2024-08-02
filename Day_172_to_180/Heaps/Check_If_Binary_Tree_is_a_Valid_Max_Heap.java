
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
  
    private int getTotalNodes(Node root){

        if(root == null) return 0;

        return 1 + getTotalNodes(root.left) + getTotalNodes(root.right);
    }

    private boolean isCBT(Node root , int index , int totalNodes){
        if(root == null) return true;

        if(index >= totalNodes) return false;

        return isCBT(root.left , index * 2+1 , totalNodes) && isCBT(root.right , index * 2+2 , totalNodes);
    }
     private boolean isMaxTree(Node root){
        if(root == null) return true;

         if(root.left == null && root.right == null) return true;

         if(root.right == null){
            return root.data > root.left.data;
         }

         return root.data > root.left.data && 
         root.data > root.right.data && isMaxTree(root.left) && isMaxTree(root.right);

        
     }
    boolean isHeap(Node tree){
        if(tree == null) return true;

        int totalNodes = getTotalNodes(tree);

        return isCBT(tree ,0, totalNodes) && isMaxTree(tree);
    }



}