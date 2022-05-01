package graph;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DFSOfGraph {

    void dfs(int node, boolean[] visit, ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> adj){
            ans.add(node);
            visit[node] = true; // mark node as visited
        // make a recursive call for all adjacent node of a given node
        for (Integer it: adj.get(node)) { // adj.get(node) means the list of all adjacent node of a current node
           // recursive call for not visited nodes
            if (visit[it] == false){
                // visit to the all adjacent nodes recursively
                dfs(it,visit,ans,adj);
            }
        }
    }

    ArrayList<Integer> dfsGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ans = new ArrayList<>();
        //visited array
        boolean[] visit = new boolean[V+1];
        for (int i = 0; i < V; i++) {
            // recursively call dfs for unvisited nodes
            if (visit[i] == false){
                dfs(i,visit,ans,adj);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        DFSOfGraph dfs = new DFSOfGraph();
        int V = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<Integer>());
        }

        //edge 1-5
        adj.get(1).add(5);
        adj.get(5).add(1);

        //edge 5-3
        adj.get(5).add(3);
        adj.get(3).add(5);

        //edge 2-4
        adj.get(2).add(4);
        adj.get(4).add(2);

        //edge 2-3
        adj.get(2).add(3);
        adj.get(3).add(2);

        //edge 3-2
        adj.get(3).add(2);
        adj.get(2).add(3);

        //edge 4-3
        adj.get(4).add(3);
        adj.get(3).add(4);

        System.out.println(dfs.dfsGraph(V,adj));
    }
}
