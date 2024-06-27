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

    public void insert(int value){
        TreeNode node = new TreeNode(value);

        if(root == null){
            root = node;
            return;
        }
    }
}
