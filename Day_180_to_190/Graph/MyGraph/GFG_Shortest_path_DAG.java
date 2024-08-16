package Graph.MyGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GFG_Shortest_path_DAG {
    private Map<Integer , List<int[]>> getAdjList(int[][] edges){
        Map<Integer , List<int[]>> map = new HashMap<>();
        for(var edge: edges){
            int from  = edge[0];
            int to = edge[1];
            int dist = edge[2];

            map.putIfAbsent(from , new ArrayList<>());
            map.get(from).add(new int[]{to , distance });
        }
        return map;
    }

    
    public int[] shortestPath(int N,int M, int[][] edges) {
         Map<Integer , List<int[]>> adj = getAdjList(edges);

		
	}
}
