package Graph.MyGraph;

public class MainWeightedDirectedGraph {
    
    public static void main(String[] args) {
        WeightedDirectedGraph graph = new WeightedDirectedGraph();

        var a = graph.createNode("A");
        var b = graph.createNode("B");
        var c = graph.createNode("C");
        var d = graph.createNode("D");
        var e = graph.createNode("E");

        a.addEdge(b,5);
        b.addEdge(c,2);
        c.addEdge(d,10);
        d.addEdge(d,8);
        e.addEdge(a,5);

        System.out.println(graph);
    }
}
