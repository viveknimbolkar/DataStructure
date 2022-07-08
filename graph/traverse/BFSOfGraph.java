package graph.traverse;

import java.util.Iterator;
import java.util.LinkedList;

// adjacency list implementation
public class BFSOfGraph {

    int V;// vertex
    // adjacency list
    LinkedList<Integer>[] adj;

    BFSOfGraph(int v){
        this.V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void bfsOfGraph(int source){
        // use to store visited and unvisited nodes
        // i.e. 1 - Not visited
        //      0 - Visited
        boolean[] visit = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        visit[source] = true;
        queue.add(source);

        // no visit each & every node of graph
        while (queue.size() != 0)
           source = queue.poll();
            System.out.print(source+" ");
            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
        Iterator<Integer> itr = adj[source].listIterator();
        while (itr.hasNext()){
            int n = itr.next();
            if (!visit[n]){
                 visit[n] = true;
                 queue.add(n);
            }
        }
    }

    // add edge into graph
    void addEdge(int v, int w){
        adj[v].add(w);
    }

    public static void main(String[] args) {
        BFSOfGraph bfs = new BFSOfGraph(4);
        int V = 2;
        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 2);
        bfs.addEdge(2, 0);
        bfs.addEdge(2, 3);
        bfs.addEdge(3, 3);

        bfs.bfsOfGraph(V);
    }
}
