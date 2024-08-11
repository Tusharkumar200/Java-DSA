package Graph.MyGraph;

public class Main {
    public static void main(String[] args) {
        Building_Graph_from_Scratch graph = new Building_Graph_from_Scratch();

        var a=  graph.createNode("A");
        var b=  graph.createNode("B");
        var c=  graph.createNode("C");
        var d=  graph.createNode("D");
        var e=  graph.createNode("E");
        var f=  graph.createNode("F");
        var g=  graph.createNode("G");

        graph.createConnection(a,b, GRAPH_DIRECTION.DIRECTED);
        graph.createConnection(a,c, GRAPH_DIRECTION.DIRECTED);
        graph.createConnection(b,d, GRAPH_DIRECTION.DIRECTED);
        graph.createConnection(b,e, GRAPH_DIRECTION.DIRECTED);
        graph.createConnection(c,f, GRAPH_DIRECTION.DIRECTED);
        graph.createConnection(e,f, GRAPH_DIRECTION.DIRECTED);
        graph.createConnection(d,g, GRAPH_DIRECTION.DIRECTED);
        graph.createConnection(f,g, GRAPH_DIRECTION.DIRECTED);

        System.out.println(graph);
        System.out.println("BFS" + graph.getBFS(a));
        System.out.println("DFS" + graph.getDFS(a));

        
    }
}
