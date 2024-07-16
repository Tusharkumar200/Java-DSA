import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Node{
    
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = right = null;
    
    }
}

public class Pair{
    Node node;
    int x;

    pubic Pair(Node node, int x){
        this.node = node;
        this.x = x;
    }
}

public class _bottomView{
    
    static ArrayList<Integer> topView(Node root){
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null) return result;
        
        Map<Integer , Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        while(!q.isEmpty()){

            Pair currentPair = q.poll();

            
                map.put(currentPair.x, currentPair.node.data);
            

            if(currentPair.node.left != null){
                q.offer(new Pair(currentPair.node.left, currentPair.x - 1));
            }

            if(currentPair.node.right != null){
                q.offer(new Pair(currentPair.node.right, currentPair.x + 1));
            }
        }

        for(var entry: map.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
    
    
    
}