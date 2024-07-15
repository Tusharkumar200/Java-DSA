import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data  = data;
        left = right = null;
    }
}

class Pair{
    Node node;
    int x;

    public Pair(Node node, int x){
        this.node = node;
        this.x = x;
    }
}
public class vertical_order_traversal {
    static ArrayList <Integer> verticalOrder(Node root){
        // Level Order Traversal

        ArrayList <Integer> result = new ArrayList<Integer>();
        if(root == null) return result;

        Map<Integer , List<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.offer(new Pair(root,0));

        while(!q.isEmpty()){
            Pair currentPair = q.poll();

            if(!map.containsKey(currentPair ,x)){
                map.put(currentPair.x , new ArrayList<>());
            }

            map.get(currentPair.x).add(currentPair.node.data);

            if(currentPair.node.left !=null){
                q.offer(new Pair(currentPair.node.left , currentPair.x -1));
            }

            if(currentPair.node.right !=null){
                q.offer(new Pair(currentPair.node.right , currentPair.x +1));
            }
        }

        for(var entry: map.entrySet()){
            for(var num: entry.getValue()){
                result.add(num);
            }
        }
        return result;
    }
}
