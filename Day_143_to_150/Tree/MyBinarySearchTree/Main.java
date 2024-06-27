package Tree.MyBinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int nums[] = {7,8,1,3,2,5,10,4};

        for(int num: nums){
            tree.insert(num);
        }

    }
}
