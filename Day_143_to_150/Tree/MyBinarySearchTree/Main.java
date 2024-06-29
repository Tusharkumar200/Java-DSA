package Tree.MyBinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int nums[] = {7,3,8,1,4,8,10};

        for(int num: nums){
            tree.insert(num);
        }
        // System.out.println(tree.find(5));
    //  Testing preOrderTraversal
        // tree.preOrderTraversal();
    
    
        // tree.inOrderTraversal();
        tree.postOrderTraversal();
    }
}
