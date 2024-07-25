import java.util.ArrayList;

class TreeNode<T>{
    T data;
    TreeNode<T> left;
    TreeNode<T> right;

    TreeNode(T data){
        this.data = data;
        left = right = null;
    }
}
public class Inorder_Predecessor_Successor_in_BTS {

    public static ArrayList <Integer> predecessorSuccessor(BinaryTreeNode<Integer> root, int key){

        ArrayList <Integer> result  = new ArrayList<Integer>();

        BinaryTreeNode<Integer> current  = root;
        int pred = -1;
        int succ = -1;

        while(current != null && current.data != key){
            if(current.data > key){

                // Go left
                succ = current.data;
                current = current.left;
            }
            else{
                //  Go Right
                pred = current.left;
                current = current.right;


            }
        }

        BinaryTreeNode<Integer>leftSubTree = current.left;
        while(leftSubTree != null){
            pred = leftSubTree.data;
            leftSubTree = leftSubTree.right;
        }

        BinaryTreeNode<Integer> rightSubTree = current.right;
        while(rightSubTree != null){
            succ = rightSubTree.data;
            rightSubTree  = rightSubTree.left;

        }
        result.add(pred);
        result.add(succ);

        return result;

    }
}
