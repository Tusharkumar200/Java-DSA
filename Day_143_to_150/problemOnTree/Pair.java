
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


// Diameter of Tree is the longest path between two nodes in a tree.
// without pair it's time complexity is O(n^2)

public class Pair{
    int dia;
    int height;

    public Pair(int dia, int height){
        this.dia = dia;
        this.height = height;

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
