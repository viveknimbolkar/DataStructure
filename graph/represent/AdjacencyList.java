package graph.represent;

import java.util.ArrayList;

public class AdjacencyList {

    public static void main(String[] args) {
        int n = 3, m = 3;
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= n; i++)
            list.add(new ArrayList<Integer>());

        // generalize version of
//        list.get(u).add(v);
//        list.get(v).add(u);

        // edge between 1 - 2
        list.get(1).add(2);
        list.get(2).add(1);

        // edge between 2 - 3
        list.get(2).add(3);
        list.get(3).add(2);
        // edge between 1 - 3
        list.get(1).add(3);
        list.get(3).add(1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

}
