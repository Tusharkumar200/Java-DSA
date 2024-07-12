// this is a GFG problem
public class Node{
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

private Pair diameterFast(Node root){
    if(root == null) return new Pair(0,0);

    Pair left = diameterFast(root.left);
    Pair right = diameterFast(root.right);

    int myDia = left.height + right.height + 1;
    
    int result = Math.max(myDia, Math.max(left.dia, right.dia));
    int myHeight = Math.max(left.height , right.height) + 1;

    return new Pair(result, myHeight);
}

public class Diameter_of_Tree {

    // * No needs of getHeight function after using Pair class

    // private int getHeight(Node root){
    //     if(root == null) return 0;

    //     int left = getHeight(root.left);
    //     int right  = getHeight(root.right);

    //     return Math.max(left, right) + 1;

    // }
    
    int diameter(Node root){
        // if(root == null) return 0;

        // int leftDia = diameter(root.left);
        // int rightDia = diameter(root.right);
        // int myDia = getHeight(root.left) + getHeight(root.right) + 1;

        // return Math.max(myDia, Math.max(leftDia, rightDia));

        return diameterFast(root).dia;
    }
}
