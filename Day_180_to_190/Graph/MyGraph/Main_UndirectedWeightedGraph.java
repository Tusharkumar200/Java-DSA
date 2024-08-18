
public class Main_UndirectedWeightedGraph{
    public static void main(String args[]){
        UndirectedWeightedGraph graph = new UndirectedWeightedGraph();

        var a  = graph.createNode("A ");
        var b  = graph.createNode("B ");
        var c  = graph.createNode("C ");
        var d  = graph.createNode("D ");
        var e  = graph.createNode("E ");

        a.addEdge(b,5);
        b.addEdge(c,10);
        c.addEdge(a,10);
        
        System.out.println(graph);
        System.out.println(graph.hasCycle());
    }
}