import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        //using adj list
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        // using DFS
        boolean[] visited = new boolean[n];
        return dfs(source, destination, adj, visited);
    }

    boolean dfs(int node, int dest, List<List<Integer>> adj, boolean[] visited){
        if(node == dest) return true;

        visited[node] = true;

        for(int nei : adj.get(node)){
            if(!visited[nei]){
                if(dfs(nei, dest, adj, visited)) return true;
            }
        }

        return false;
    }
}