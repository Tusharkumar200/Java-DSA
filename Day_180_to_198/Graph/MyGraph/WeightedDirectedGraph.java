package Graph.MyGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Node{
    private String label;
    private List<WeightedEdge> edges;

    public Node(String label){
        this.label = label;
        this.edges = new ArrayList<>();
    }

    public void addEdge(Node node , int weight){
        this.edges.add(new WeightedEdge(node, weight));
    }
    public List<WeightedEdge> getChildren(){
        return this.edges;
    }

    public String toString(){
        return this.label;
    }

}

 class WeightedEdge{
    public Node node;
    public int weight;

    public WeightedEdge(Node node , int weight){
        this.weight = weight;
        this.node = node;
    }

    public WeightedEdge(Node node ){
        this.weight = 0;
        this.node = node;
    }

}

public class WeightedDirectedGraph {
    private Map<String , Node> nodes;
    public WeightedDirectedGraph(){
        this.nodes = new HashMap<>();
    }
    public Node createNode(String label){
        if(!nodes.containsKey(label))
                nodes.put(label,new Node(label));
        return nodes.get(label);
    }
    public void createConnection(Node from , Node to , int weight){
        from.addEdge(to, weight);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(var entry: nodes.entrySet()){
            sb.append(entry.getValue().toString().concat("-- "));
            for (var child :entry.getValue().getChildren()) {
                sb.append(child.weight).append(" --> ").append(child.node).append("\n");
            }
        }
        return sb.toString();
    }
}
