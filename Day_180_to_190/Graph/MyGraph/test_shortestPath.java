package Graph.MyGraph;

import java.util.Arrays;

public class test_shortestPath {
    public static void main(String[] args) {
        GFG_Shortest_path_DAG gfg = new GFG_Shortest_path_DAG();

        int[][] edges = new int[][]{
            {0,1,2},
            {0,4,1},
            {4,5,4},
            {4,2,2},
            {1,2,3},
            {2,3,6},
            {5,3,1},
        };
        System.out.println(Arrays.toString(gfg.shortestPath(6,7,edges)));
    }
}
