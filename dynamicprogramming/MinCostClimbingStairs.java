package dynamicprogramming;
//https://leetcode.com/problems/min-cost-climbing-stairs/
public class MinCostClimbingStairs {
    int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];

        for(int i =0; i < n; i++){
            if(i<2) dp[i] = cost[i];
            else dp[i]=cost[i]+Math.min(dp[i-2],dp[i-1]);
        }
        return Math.min(dp[n-1],dp[n-2]);
    }

    public static void main(String[] args) {
        MinCostClimbingStairs mincost = new MinCostClimbingStairs();
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(mincost.minCostClimbingStairs(cost));
    }
}
