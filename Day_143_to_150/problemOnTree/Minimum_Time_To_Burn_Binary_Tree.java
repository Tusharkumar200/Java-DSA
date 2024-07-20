import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class Node{
    int data;
    Node left;
    Node right;
    
    public Node(int data){
        this.data =data;
        left = right = null;
    }
}

public class Minimum_Time_To_Burn_Binary_Tree {

    private static void generateNodeToParentMapping(Node root, Map<Node, Node> map){
        if(root == null) return;
        
        if(root.left != null) map.put(root.left, root);

        if(root.right != null) map.put(root.right, root);
        
        generateNodeToParentMapping(root.left, map);
        generateNodeToParentMapping(root.right , map);
    }

    private static Node findNodeWithValue(Node root, int target){
        if(root == null) return null;

        if(root.data == target) return root;

        Node left = findNodeWithValue(root.left, target);
        if(left != null) return left;
        Node right = findNodeWithValue(root.right, target);
        if(right != null) return right;

        return null;
    }

    public static int minTime(Node root , int target){
    //  1. Generate a map of node to parent mapping
        Map<Node, Node> nodeToParentMap = new HashMap<>();

        generateNodeToParentMapping(root, nodeToParentMap);
        nodeToParentMap.put(root, root);
    // 2. Find the node with the target value
        Node targetNode = findNodeWithValue(root, target);

    // 3. Burn The Entire Tree - Level Order Traversal

    Queue<Node> q = new LinkedList<>();
     Set<Node> visited = new HashSet<>();
     int timeToBurn =0;   
        q.add(targetNode);
        visited.add(targetNode);

        while (q.isEmpty()) {
            int size = q.size();
            boolean isAnythingBurned = false;
            for(int i=0; i<size; i++){
                Node current = q.poll();

                if(current.left != null && !visited.contains(current.left)){
                    q.add(current.left);
                    visited.add(current.left);
                    isAnythingBurned = true;
                }

                if(current.right != null && !visited.contains(current.right)){
                    q.add(current.right);
                    visited.add(current.right);
                    isAnythingBurned = true;
                }

                if(nodeToParentMap.get(current) != current && !visited.contains(nodeToParentMap.get(current))){
                    q.add(nodeToParentMap.get(current));
                    visited.add(nodeToParentMap.get(current));
                    isAnythingBurned = true;
                }
            }
            if(isAnythingBurned) timeToBurn++;
        }
        return timeToBurn;

    }
}
