package Graph.MyGraph;

public class Main {
    public static void main(String[] args) {
        Building_Graph_from_Scratch graph = new Building_Graph_from_Scratch();

        var a=  graph.createNode("A");
        var b=  graph.createNode("B");
        var c=  graph.createNode("C");
        var d=  graph.createNode("D");

        graph.createConnection(a,b, GRAPH_DIRECTION.DIRECTED);
        System.out.println(graph);
    }
}
