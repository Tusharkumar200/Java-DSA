package Tree;


// Morris Traversal is a way to traverse the tree without using recursion and without using a stack.

class TreeNode {
    int data;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }
}

public class Morris_Traversal {
    public void morrisInOrderTraversal() {
        TreeNode root = new TreeNode(0); // Replace '0' with the appropriate value for your tree's root node.
        TreeNode current = root;

    while(current != null) {
        if (current.leftChild == null) {
            System.out.print(current.data + " ");
            current = current.rightChild;
        }
        else {
            TreeNode predecessor = current.leftChild;
            while(predecessor.rightChild != null && predecessor.rightChild != current) {
                predecessor = predecessor.rightChild;
            }

            if (predecessor.rightChild == null) {
                predecessor.rightChild = current;
                current = current.leftChild;
            } else {
                predecessor.rightChild = null;
                System.out.print(current.data + " ");
                current = current.rightChild;
            }
        }
    }
}

public void morrisPreOrderTraversal() {
    TreeNode root = new TreeNode(0);
    TreeNode current = root;

    while(current != null) {
        if (current.leftChild == null) {
            System.out.print(current.data + " ");
            current = current.rightChild;
        }
        else {
            TreeNode predecessor = current.leftChild;
            while(predecessor.rightChild != null && predecessor.rightChild != current) {
                predecessor = predecessor.rightChild;
            }

            if (predecessor.rightChild == null) {
                predecessor.rightChild = current;
                System.out.print(current.data + " ");
                current = current.leftChild;
            } else {
                predecessor.rightChild = null;
                current = current.rightChild;
            }
        }
    }
}
}
