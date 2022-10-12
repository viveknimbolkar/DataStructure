package greedy;

import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/maximum-profit-in-job-scheduling/
public class MaximumProfitInJobScheduling {

    static class Job{
        int startTime, endTime, profit;
        Job(int startTime, int endTime, int profit){
            this.startTime = startTime;
            this.endTime = endTime;
            this.profit = profit;
        }
    }

    int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        // adding all the variables into a single job unit
        Job[] jobs = new Job[startTime.length];
        for (int i = 0; i < startTime.length; i++)
            jobs[i] = new Job(startTime[i],endTime[i],profit[i]);

        // Sort jobs according to the deadline (decreasing)
        Arrays.sort(jobs,(a,b)->(b.profit-a.profit));

        // find the max maxEndTime
        int maxEndTime = 0;
        for (int i = 0; i < jobs.length; i++)
            if (jobs[i].endTime > maxEndTime) maxEndTime = jobs[i].endTime;

        // initially store all the endtime as -1
        int[] result = new int[maxEndTime+1];
        for (int i = 0; i < result.length; i++)
            result[i] = -1;

        // start assigning results
        int maxProfit = 0;
        for (int i = 0; i < jobs.length; i++) {
            for (int j = jobs[i].endTime; j > 0; j--) {
                if (result[j] == -1){
                    result[j] = i;
                    maxProfit += jobs[i].profit;
                    break;
                }
            }
        }


        return maxProfit;
    }

    public static void main(String[] args) {
        MaximumProfitInJobScheduling maxpro = new MaximumProfitInJobScheduling();
        int[] startTime = {1,2,3,3}, endTime = {3,4,5,6}, profit = {50,10,40,70};
        System.out.println("Max profit "+maxpro.jobScheduling(startTime,endTime,profit));
    }
}
