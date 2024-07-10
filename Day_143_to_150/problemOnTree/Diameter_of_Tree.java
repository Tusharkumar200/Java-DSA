
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

    private int getHeight(Node root){
        if(root == null) return 0;

        int left = getHeight(root.left);
        int right  = getHeight(root.right);

        return Math.max(left, right) + 1;

    }
    
    int diameter(Node root){
        if(root == null) return 0;

        int leftDia = diameter(root.left);
        int rightDia = diameter(root.right);
        int myDia = getHeight(root.left) + getHeight(root.right) + 1;

        return Math.max(myDia, Math.max(leftDia, rightDia));
    }
}
