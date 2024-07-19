
class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
         this.data = data;
         left = right = null;
    }
}

class CP{
    Node node;
     int height;
     int sum;

     public CP(Node node, int height , int sum){
        this.node = node;
        this.height = height;
        this.sum = sum;
     }

}
public class Sum_of_nodes_on_the_longest_path_from_root_to_leaf_node {

    private CP solve(Node root){

        if(root == null) return new CP(null, 0,0);

        CP left = solve(root.left);
        CP right = solve(root.right);

        if(left.height > right.height){
            return new CP(left.node, left.height + 1, left.sum + root.data);
        }
        return new CP(right.node, right.height + 1, right.sum + root.data);
        
    }
    
    public int sumOFLongRootToLeafPath(Node root){
        return solve(root).sum;
    }
}
