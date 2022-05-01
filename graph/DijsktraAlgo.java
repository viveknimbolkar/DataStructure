package graph;

public class DijsktraAlgo {

    static int V = 9;

    int minDistance(int[] dist, boolean[] shortestPath){
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int v = 0; v < V; v++) {
            if (shortestPath[v] == false && dist[v] <= min){
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    void dijsktra(int[][] g, int src){
        // store the shortest distance from src to i
        int[] dist = new int[V];
        // spt[i] is true if i is included int shortest path
        boolean[] sptSet = new boolean[V];

        // initialize all values as infinity and false resp.
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        // distance of source node to itself is always zero
        dist[src] = 0;

        // now traverse throught graph
        for (int i = 0; i < V-1; i++) {
            // find the min vertex from set of vertices not yet proceed
            int u = minDistance(dist,sptSet);
            // add that vertex in sptSet picked
            sptSet[u] = true;
            for (int v = 0; v < V; v++) {
                if (!sptSet[v] && g[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + g[u][v] < dist[v]){
                    dist[v] = dist[u] + g[u][v];
                }
            }
        }
        printShortestPath(dist);
    }

    void printShortestPath(int[] dist){
        System.out.println("Vertex \t Distance");
        for (int i = 0; i < V; i++) {
            System.out.println(i+" \t\t "+dist[i]);
        }
    }

    public static void main(String[] args) {
        DijsktraAlgo dij = new DijsktraAlgo();
        int[][] graph = {
                { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 }
        };

        dij.dijsktra(graph,0); // source node is 0
    }
}
