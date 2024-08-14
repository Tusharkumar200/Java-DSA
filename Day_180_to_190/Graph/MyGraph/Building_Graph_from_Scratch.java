package Graph.MyGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

 enum GRAPH_DIRECTION{

    DIRECTED,
    UNDIRECTED,
}

public class Building_Graph_from_Scratch {
    class Node {
        public String value;

        private List<Node> edges;

        public Node(String value) {
            this.value = value;
            this.edges = new ArrayList<>();
        }

        public void addEdge(Node node){
            if(this.edges.contains(node)) return;
            this.edges.add(node);
        }

        public List<Node> getChildren(){
            return this.edges;
        }

        public String toString() {return this.value;}

        
    }

    
    private Map<String, Node> nodes;

    public Building_Graph_from_Scratch() {
        this.nodes = new HashMap<>();
    }

    public Node createNode(String value) {

        if (!nodes.containsKey(value))
            nodes.put(value, new Node(value));

        return nodes.get(value);
    }

    public void createConnection(Node from, Node to, GRAPH_DIRECTION direction){
        from.addEdge(to);
        if(direction == GRAPH_DIRECTION.UNDIRECTED){
            to.addEdge(from);
        }


    }


//  BFS Traversal
    public List<Node> getBFS(Node startingNode){
        List<Node> result = new ArrayList<>();
        Queue<Node> q= new LinkedList<>();
        Set<Node> visited = new HashSet<>();

        q.offer(startingNode);
        visited.add(startingNode);

        while(!q.isEmpty()){
            Node current = q.poll();
            result.add(current);

            for(Node child: current.getChildren()){
                if(!visited.contains(child)){
                    q.offer(child);
                    visited.add(child);
                }
            }
            
        }
        return result;
    }
//  DFS Traversal
    private void getDFSRec(Node node , Set<Node> visited , List<Node> result){
        if(node == null || visited.contains(node))return;

        result.add(node);
        visited.add(node);

        for(Node child: node.getChildren()){
            getDFSRec(child, visited, result);
        }
    }
    
    public List<Node> getDFS(Node initalNode){
            List<Node> result = new ArrayList<>();
            getDFSRec(initalNode, new HashSet<>(), result);
            return result;
    }
     

    private boolean hashCycle(Node node, HashSet<Node> visiting , HashSet<Node> visited){
        visiting.add(node);

        
        for(Node child:node.getChildren()){
            if(visiting.contains(child)) return true;
            if(hashCycle(child, visiting, visited)) return true;
        }
      
        visiting.remove(node);
        visited.add(node);

        return false;

    }
    public boolean hashCycle(){
        List<Node> all = new ArrayList<>();
        HashSet<Node> visiting = new HashSet<>();
        HashSet<Node> visited = new HashSet<>();

        for(var entry: nodes.entrySet()){
            all.add(entry.getValue());
        }

        for(Node n: all){
            
            if(!visited.contains(n)) {
                if(hashCycle(n, visiting , visited)) return true;
            }
        }
        return false;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(var entry: nodes.entrySet()){
            sb.append(entry.getKey()).append(("--> ")).append(entry.getValue().getChildren()).append("\n");
        }
        return sb.toString();
    }

    

}
