package Graph.MyGraph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Building_Graph_from_Scratch {
    class Node {
        public String value;
    
        public Node(String value) {
            this.value = value;
        }
    }

    private Map<Node , List<Node>> adjacencyList;

    private Map<String, Node> nodes;

    public Building_Graph_from_Scratch(){
        this.adjacencyList = new HashMap<Node , List<Node>>();
        this.nodes = new HashMap<>();
    }
    
    public Node creatNode(String value){

        if(!nodes.containsKey(value))
            nodes.put(value, new Node(value));
        
        return nodes.get(value);
    }
}
