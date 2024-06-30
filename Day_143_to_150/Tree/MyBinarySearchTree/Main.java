package Tree.MyBinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int nums[] = {7,3,9,1,4,8,10,1,2};

        for(int num: nums){
            tree.insert(num);
        }
        // System.out.println(tree.find(5));
    //  Testing preOrderTraversal
        // tree.preOrderTraversal();
    
    //  Testing inOrderTraversal
        // tree.inOrderTraversal();

    //  Testing postOrderTraversal
        // tree.postOrderTraversal();

        // System.out.println(tree.dept(1));

        System.out.println(tree.getHeightForNodeWithValue(9));
    }
}
