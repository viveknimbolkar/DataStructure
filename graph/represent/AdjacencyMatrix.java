package graph.represent;

import java.util.ArrayList;

public class AdjacencyMatrix {

    public static void main(String[] args) {
       int n = 3, m = 3;
       int[][] adj = new int[n+1][n+1];

       // edge between 1 - 2
       adj[1][2] = 1;
       adj[2][1] = 1;

        // edge between 2 - 3
        adj[2][3] = 1;
        adj[3][2] = 1;

        // edge between 1 - 3
        adj[1][3] = 1;
        adj[3][1] = 1;

        for (int i = 0; i < adj.length; i++) {
            for (int j = 0; j < adj[i].length; j++) {
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }

    }
}
