package array.matrix;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestNumber {
    // using priority queue
    int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++) {
                pq.add(matrix[i][j]);
                // store elements upto the k size into priorityqueue
                if (pq.size() > k)
                    pq.poll();
            }

        return pq.peek();
    }

    public static void main(String[] args) {
        KthSmallestNumber kth = new KthSmallestNumber();
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int[][] t = {
                {1,2},
                {1,3}
        };
        int k = 8;

        System.out.println("K'th smallest number: "+kth.kthSmallest(matrix,k));
    }

}
