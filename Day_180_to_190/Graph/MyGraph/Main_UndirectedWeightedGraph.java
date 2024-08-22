
public class Main_UndirectedWeightedGraph{
    public static void main(String args[]){
        UndirectedWeightedGraph graph = new UndirectedWeightedGraph();

        var a  = graph.createNode("A ");
        var b  = graph.createNode("B ");
        var c  = graph.createNode("C ");
        var d  = graph.createNode("D ");
        // var e  = graph.createNode("E ");

        // a.addEdge(b,1);
        // a.addEdge(c,3);
        // b.addEdge(b,10);
        // b.addEdge(d,4);
        // d.addEdge(e,4);
        // d.addEdge(e,6);
        
        // System.out.println(graph);
        // System.out.println(graph.hasCycle());

        // System.out.println(graph.dijkstrasAlgorithm(a, e));


        // Testing Prim's Algorithm Code

        a.addEdge(b,3);
        a.addEdge(c,1);
        b.addEdge(c, 2);
        b.addEdge(d, 4);
        c.addEdge(d, 10);

        System.out.println(graph.getMinimumSpanningTree(a));
    }
}