
class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class Diameter_of_Tree {
    
    int diameter(Node root){
        if(root == null) return 0;

        int leftDia = diameter(root.left);
        int rightDia = diameter(root.right);
        int myDia = getHeight(root.left) + getHeight(root.right) + 1;

        return Math.max(myDia, Math.max(leftDia, rightDia));
    }
}
