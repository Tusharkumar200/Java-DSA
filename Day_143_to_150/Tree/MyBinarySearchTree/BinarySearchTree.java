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
// Travelling Nodes using Recursion
    public TreeNode insert(TreeNode root ,int value){
        if(root == null){
            // System.out.println("Root is Empty,insert "+ value);
            root = new TreeNode(value);
            return root;
        }

        if(value <= root.data){
            // System.out.println("Value "+ value + "is less the root");
            // System.out.println("Going to left");
            root.leftChild = insert(root.leftChild, value);
        }
        else{
            // System.out.println("Value "+ value + "is grater the root");
            // System.out.println("Going to right");
            root.rightChild = insert(root.rightChild, value);
        }

       return root;
    }

// Find Element in Tree.
    private TreeNode find (TreeNode root, int value){
        if(root == null) return null;

        if(root.data == value) return root;

        if(value <root.data){ // search in left subtree
            return find(root.leftChild, value);
        }

        return find(root.rightChild , value);
    }

    public TreeNode find(int value){
        return find(root, value);
    }

    // Pre-Order Traversal
    // Root -> Left -> Right

    public void preOrderTraversal(TreeNode root){
        if(root == null) return;

        System.out.println(root.data);
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }
    public void preOrderTraversal(){
        preOrderTraversal(root);
    }

// In-Order Tree Traversal
//  Left -> Root -> Right

    public void inOrderTraversal(TreeNode root){
        if(root == null) return;

        inOrderTraversal(root.leftChild);
        System.out.println(root.data);
        inOrderTraversal(root.rightChild);
    }
    public void inOrderTraversal(){
        inOrderTraversal(root);
    }

    // Post-Order Tree Traversal
    // Left -> Right -> Root

    public void postOrderTraversal(TreeNode root){
        
        if(root == null) return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.println(root.data);
    }
    public void postOrderTraversal(){
        postOrderTraversal(root);
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

    
    private int dept(TreeNode root, int value, int dept){
        if(root == null) return -1;

        if(root.data == value) return dept;

        if(value <= root.data){
            return dept(root.leftChild , value, dept + 1);
        }
        return dept(root.rightChild , value, dept + 1);
    }
    public int dept(int value){
          return  dept(root, value, 0);
    }

    public int heightOfTree(TreeNode root){
        if(root == null) return -1;

        if(root.leftChild == null && root.rightChild == null) return 0;

        return 1 + Math.max(heightOfTree(root.leftChild) ,heightOfTree(root.rightChild));
    }

    public int getHeightForNode(TreeNode root , int value){
        if(root == null) return -1;
        if(root.data == value) return heightOfTree(root);

        if(value <= root.data) return getHeightForNode(root.leftChild, value);
        return getHeightForNode(root.rightChild, value);
    }

    public int getHeight(){
        return heightOfTree( root);
    }

    public int getHeightForNodeWithValue(int value){
        return getHeightForNode(root, value);
    }

    // Minimum Value In Tree

    public TreeNode getMin(TreeNode root){
        if(root == null) return null;

        if(root.leftChild == null) return root;
        return getMin(root.leftChild);
    }
    
    public TreeNode getMin(){
        return getMin(root);
    }
}
