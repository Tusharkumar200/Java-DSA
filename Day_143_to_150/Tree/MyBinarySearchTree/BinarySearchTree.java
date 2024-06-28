package Tree.MyBinarySearchTree;


class TreeNode{
    int data;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode(int data){
        this.data = data;
    }

    public String toString(){
        return "value = "+ this.data;
    }
}
public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree(){
        this.root = null;
    }

    public TreeNode insert(TreeNode root ,int value){
        if(root == null){
            System.out.println("Root is Empty,insert "+ value);
            root = new TreeNode(value);
            return root;
        }

        if(value <= root.data){
            System.out.println("Value "+ value + "is less the root");
            System.out.println("Going to left");
            root.leftChild = insert(root.leftChild, value);
        }
        else{
            System.out.println("Value "+ value + "is grater the root");
            System.out.println("Going to right");
            root.rightChild = insert(root.rightChild, value);
        }

       return root;
    }

    public void insert(int value){

       root = insert(root,value);
        // TreeNode node = new TreeNode(value);

        // if(root == null){
        //     root = node;
        //     return;
        // }
        //     TreeNode current = root;
        // while(true){
        //     if(value <= current.data){ // Go Left
        //         if(current.leftChild == null){
        //             current.leftChild = new TreeNode(value);
        //             break;
        //         }
        //         current = current.leftChild;
        //     }
        //     else{  // Go Right
        //         if(current.rightChild == null){
        //             current.rightChild = new TreeNode(value);
        //             break;
        //         }
        //         current = current.rightChild;
        //     }
        // }
    }
}
