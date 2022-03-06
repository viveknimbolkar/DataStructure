package queue;

import java.util.PriorityQueue;

// https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1/?
public class MinimumCostOfRopes {

    long minCost(long[] arr, int n){
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.offer(arr[i]);
        }
        System.out.println(pq);
        long tempSum = 0;
        long totalSum = 0;

        while (pq.size() > 1){
            long x = pq.poll();
            long y = pq.poll();
            tempSum = x + y;
            totalSum = totalSum + tempSum;
            pq.offer(totalSum);
        }

        return totalSum;
    }

    public static void main(String[] args) {
        MinimumCostOfRopes find = new MinimumCostOfRopes();
        long[] ropes = {4,3,2,6};
        System.out.println(find.minCost(ropes,ropes.length));
    }
}
