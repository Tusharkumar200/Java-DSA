package Tree.MyBinarySearchTree;

public class Main {
    
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        BinarySearchTree tree2 = new BinarySearchTree();
        int nums[] = {7,3,9,14,4,8,10,18,2};

        for(int num: nums){
            tree.insert(num);
        }
        for(int num: nums){
            tree2.insert(num);
        }
        // System.out.println(tree.find(5));
    //  Testing preOrderTraversal
        // tree.preOrderTraversal();
    
    //  Testing inOrderTraversal
        // tree.inOrderTraversal();

    //  Testing postOrderTraversal
        // tree.postOrderTraversal();

        // System.out.println(tree.dept(1));

        // System.out.println(tree.getHeightForNodeWithValue(9));

    // Testing getMin

        // System.out.println(tree.getMin());

        // System.out.println(tree.isEqual(tree2));
        //  System.out.println(tree.nodesAtKDistance(2));

        System.out.println(tree.levelOrderTraversal());
        
    }
}
