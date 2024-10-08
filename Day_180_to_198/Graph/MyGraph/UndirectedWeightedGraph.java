import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
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
        this.edges.add(new WeightedEdge(this, weight, to));
        to.edges.add(new WeightedEdge(to, weight, this));
    }

    public String toString(){
        return this.label;
    }
}

private class WeightedEdge{
    public Node to;
    public Node from;
    public int weight;

    public WeightedEdge(Node from , int weight , Node to){
        this.weight = weight;
        this.from = from;
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

// Prim's Algorithm Code

public UndirectedWeightedGraph getMinimumSpanningTree(Node initialNode){

    UndirectedWeightedGraph tree = new UndirectedWeightedGraph();
    PriorityQueue<WeightedEdge> q = new PriorityQueue<>(Comparator.comparing(e -> e.weight));

    tree.createNode(initialNode.label);

    for(var edge: initialNode.edges)
        q.offer(edge);
    
    while(tree.nodes.size() < nodes.size()){
        WeightedEdge currentEdge = q.poll();
        Node nextNode = currentEdge.to;

        if(tree.nodes.containsKey(nextNode.label)) continue;

        tree.createNode(nextNode.label);

        tree.nodes.get(currentEdge.from.label).addEdge(nextNode, currentEdge.weight);

        for(var edge: nextNode.edges)
            if(!tree.nodes.containsKey(edge.to.label))
                    q.offer(edge);


    }
    return tree;
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