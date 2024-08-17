
public class Main{
    public static void main(String args[]){
        UndirectedWeightedGraph Graph = new UndirectedWeightedGraph();

        var a  = graph.createNode("A ");
        var b  = graph.createNode("B ");
        var c  = graph.createNode("C ");
        var d  = graph.createNode("D ");
        var e  = graph.createNode("E ");

        a.addEdge(b,5);
        System.out.println(graph);
    }
}