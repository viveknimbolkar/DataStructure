package graph.algos;

public class PrimsAlgoUsingMatrix {

    static int v = 5;

    // get the min key value from the set of vertices not yet included in mst
    int minKey(int[] key, boolean[] mstSet){
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int i = 0; i < v; i++) {
            if (mstSet[i] == false && key[i] < min){
                min = key[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    void primsMST(int v, int[][] g){
        int[] parent = new int[v]; // store constructed tree
        int[] key = new  int[v]; // to pick min weight edge
        boolean[] mstSet = new boolean[v]; // represent set of vertices included in mst

        // set all keys as infinite
        for (int i = 0; i < v; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }

        // in prims wee need to start from any vertex
        key[0] = 0; // starting from first vertex
        parent[0] = -1; // first node is always root of mst

        // traverse upto the min no. of vertices
        for (int i = 0; i < v-1; i++) {
            int u = minKey(key, mstSet);
            for (int j = 0; j < v; j++) {
                if (g[u][j] != 0 && mstSet[j] == false && g[u][j] < key[j]){
                    parent[j] = u;
                    key[j] = g[u][j];
                }
            }
        }
        printMST(parent,g);
    }

    // print mst
    void printMST(int[] parent, int[][] g){
        System.out.println("Edge \t Weight");
        for (int i = 1; i < v; i++) {
            System.out.println(parent[i]+" - "+i+" \t"+g[i][parent[i]]);
        }
    }

    public static void main(String[] args) {
        PrimsAlgoUsingMatrix prims = new PrimsAlgoUsingMatrix();
        int[][] graph = {
                { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 }
        };
        prims.primsMST(v, graph);
    }
}
