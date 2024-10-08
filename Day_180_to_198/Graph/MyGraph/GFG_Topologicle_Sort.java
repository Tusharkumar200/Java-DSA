package Graph.MyGraph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class GFG_Topologicle_Sort {
    static void solve(Integer node , Set<Integer> visited , Stack <Integer> stack, ArrayList<ArrayList<Integer>> adj){
        if(visited.contains(node)){
            return;
        }
        visited.add(node);
        for(int child:adj.get(node)){
            solve(child,visited,stack,adj);
            
        }
        stack.push(node);


    }

    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        Set<Integer> visited = new HashSet<>();
        Stack <Integer> stack = new Stack<>();
        int [] ans = new int[V];

        for(int i = 0 ; i < V ; i++){
            if(!visited.contains(i)){
                solve(i,visited,stack,adj);
            }
        }
        int index = 0;
        while(!stack.isEmpty()){
            ans[index++] = stack.pop();
        } 
        return ans;
    }
}
