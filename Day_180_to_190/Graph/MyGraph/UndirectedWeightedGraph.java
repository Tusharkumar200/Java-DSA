import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class UndirectedWeightedGraph{

private class EdgeEntry{
    public Node node;
    public int weight;
    public Node parent;

    public EdgeEntry(Node node ,int weight , Node parent){
        this.node = node;
        this.weight = weight;
        this.parent = parent;
    }
}

public class Node{
    public String label;

    private List<WeightedEdge> edges;

    public Node(String label){
        this.label = label;
        this.edges = new ArrayList<WeightedEdge>();
    }

    public void addEdge(Node to , int weight){
        this.edges.add(new WeightedEdge(to, weight));
        to.edges.add(new WeightedEdge(this, weight));
    }

    public String toString(){
        return this.label;
    }
}

private class WeightedEdge{
    public Node to;
    public int weight;

    public WeightedEdge(Node to , int weight){
        this.weight = weight;
        this.to = to;
    }

    public String toString(){
        return "{Node=" + to + ", Weight= "+ this.weight + "}";
    }
}

public Map<String, Node> node;

public UndirectedWeightedGraph(){
    this.node = new HashMap<>();
}

public Node createNode(String label){
    node.putIfAbsent(label , new Node(label));
    return node.get(label);
}   


public String dijkstrasAlgorithm(Node initialNode , Node toNode){
    Set<Node> visited = new HashSet<>();
    Map<Node , EdgeEntry > map = new HashMap<>();

    PriorityQueue<EdgeEntry> q = new PriorityQueue<>(new Comparator<EdgeEntry>(){
        @override
        public int compare(EdgeEntry 01 , EdgeEntry 02){
            return o1.weight - o2.weight;
        }
    });

    var entry = new EdgeEntry(initialNode, 0, null);
    map.put(initialNode, entry);
    q.offer(entry);

    while(!q.isEmpty()){
        var top = q.poll();
        if(visited.contains(top.node)) continue;

        for(var child: top.node.edges){
            int newDistance = top.weight + child.weight;

            if(map.containsKey(child.to) || newDistance < map.get(child.to).weight){
                var newEntry = new EdgeEntry(child.to , newDistance , top.node);
                map.put(child.to, newEntry);
                q.offer(newEntry);
            }
        }
        visited.add((top.node));
    }
    StringBuilder sb = new StringBuilder();
    var tempEntry = map.get(toNode);

    while(tempEntry !=null){
        sb.append(tempEntry.node).append(" ");
        tempEntry = map.get(tempEntry.parent);
    }

    return sb.reverse().append(" = ").append(map.get(toNode).weight).toString();

}

private boolean hasCycle(Node node  , Node parent , Set<Node> visited){
    
    if( visited.contains(node)) return false;
    visited.add(node);
    for(var child: node.edges){
        if(child.to == parent) continue;
        if(visited.contains(child.to) || hasCycle(child.to , node , visited)) return true;
    }

    
    return false;
}

public boolean hasCycle(){
    for(var node: node.values()){
        if(hasCycle(node , null, new HashSet<>())) return true;

    }
    return false;
}




public String toString(){
    StringBuilder sb = new StringBuilder();

    for(var entry: nodes.entrySet()){
        sb.append(entry.getValue().toString().concat("-- "));
        for (var child :entry.getValue().edges()) {
            sb.append(child.weight).append(" --> ").append(child.to).append("\n");
        }
    }
    return sb.toString();
}
}