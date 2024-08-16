package Graph.MyGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class GFG_Shortest_path_DAG {
    private Map<Integer , List<int[]>> getAdjList(int[][] edges){
        Map<Integer , List<int[]>> map = new HashMap<>();
        for(var edge: edges){
            int from  = edge[0];
            int to = edge[1];
            int distance = edge[2];

            map.putIfAbsent(from , new ArrayList<>());
            map.get(from).add(new int[]{to , distance });
        }
        return map;
    }
    private void getTopologicalSort(int node , Set<Integer> visited , Stack<Integer> stack , Map<Integer , List<int[]>> adj){
        if(visited.contains(node))return;
        visited.add(node);

        if(adj.containsKey(node)){
            for(int[] child: adj.get(node)){
                getTopologicalSort(child[0] , visited , stack , adj);
            }
        }
        
        stack.push(node);
    }

    public Stack<Integer> getTopologicalSort(Map<Integer , List<int[]>> adj ){
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();

        for(var entry: adj.entrySet()){
            if(!visited.contains(entry.getKey())){
            getTopologicalSort(entry.getKey() , visited , stack , adj);
            }
        }
        
        return stack;
    }
    public int[] shortestPath(int N,int M, int[][] edges) {
         Map<Integer , List<int[]>> adj = getAdjList(edges);
         Stack<Integer> topological  = getTopologicalSort(adj);

            int[] distances = new int[N];

            for(int i = 0; i<N; i++){
                distances[i] = Integer.MAX_VALUE;
            }
            distances[0] = 0;

            while(!topological.isEmpty()){

                int top = topological.pop();

                if(!adj.containsKey(top)) continue;

                for(int[] child: adj.get(top)){
                    int newDistance = distances[top] + child[1];
                    if(newDistance < distances[child[0]]){
                        distances[child[0]] = newDistance;
                    }
                }
            }
            return distances;

		
	}
}
