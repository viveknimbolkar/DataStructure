package graph;

import java.util.ArrayList;

// a node to store vertex and weight
class Node{
    private int v; // vertex
    private int w; // weight

    Node(){}

    Node(int V, int W){
        this.v = V;
        this.w = W;
    }

    public int getV() {
        return v;
    }

    public int getW() {
        return w;
    }

}
public class PrimsAlgorithm {

    // brute force approach
    void primsAlgo(ArrayList<ArrayList<Node>> adj, int n){

        int[] key = new int[n];
        int[] parent = new int[n];
        boolean[] mstSet = new boolean[n];

        // initialize all the arrays
        for (int i = 0; i < n; i++) {
            key[i] = 10000000; // initialize array with infinity
            mstSet[i] = false;
            parent[i] = -1;
        }
        key[0] = 0; //initialize key as zero to first node

        // loop through all nodes of graph
        for (int i = 0; i < n-1; i++) {
            int mini = 100000000, u = 0;
            // check which is minimum path among all the adjancent nodes
            for (int j = 0; j <n ; j++) {
                if (mstSet[j] == false && key[j] < mini){
                    mini = key[j];
                    u = j;
                }
            }
            // now here we got the minimal mst edge
            mstSet[u] = true;
            // iterate adjancent nodes to get minimal edge
            for (Node it: adj.get(u)) {
                if (mstSet[it.getV()] == false && it.getW() < key[it.getV()]){
                    parent[it.getV()] = u;
                    key[it.getV()] = it.getW();
                }
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.println(parent[i]+" "+i);
        }
    }

    public static void main(String[] args) {
        PrimsAlgorithm prims = new PrimsAlgorithm();
        int n = 5;
        ArrayList<ArrayList<Node>> adj = new ArrayList<ArrayList<Node>>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Node>());
        }

        // adjacency list representation of weighted graph
        adj.get(0).add(new Node(1,2));
        adj.get(1).add(new Node(0,2));


        adj.get(0).add(new Node(2,3));
        adj.get(1).add(new Node(1,3));


        adj.get(0).add(new Node(3,6));
        adj.get(1).add(new Node(0,6));


        adj.get(0).add(new Node(3,8));
        adj.get(1).add(new Node(1,8));


        adj.get(0).add(new Node(4,5));
        adj.get(1).add(new Node(1,5));


        adj.get(0).add(new Node(4,7));
        adj.get(1).add(new Node(2,7));

        prims.primsAlgo(adj,n);
    }
}
