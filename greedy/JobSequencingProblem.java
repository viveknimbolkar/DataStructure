package greedy;

import java.util.Arrays;
//https://www.youtube.com/watch?v=LjPx4wQaRIs
//https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}

public class JobSequencingProblem {

    int[] JobScheduling(Job arr[], int n) {
        // comparator object to sort jobs according to their profits (decreasing order)
        Arrays.sort(arr, (a,b)->(b.profit-a.profit));
        // find the max deadline
        int maxi = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i].deadline > maxi) maxi = arr[i].deadline;

        // store the result of array
        int[] result = new int[maxi+1];
        // initialized all the values by -1
        for (int i = 0; i < result.length; i++)
            result[i] = -1;
        
        // start alloting the jobs on the respective dates
        int counter = 0, profit = 0;
        for (int i = 0; i < n; i++) {
            // allot the job to their perfect position
            for (int j = arr[i].deadline; j > 0 ; j--) {
                if (result[j] == -1){
                    result[j] = i; // assign the id
                    counter++;
                    profit += arr[i].profit;
                    break; // now job was assigned
                }
            }
        }

        // create an answer
        int[] ans = new int[2];
        ans[0] = counter;
        ans[1] = profit;
        return ans;
    }

    public static void main(String[] args) {
        JobSequencingProblem job = new JobSequencingProblem();
        int n = 4;
        Job[] jobs = {
                new Job(1,4,20),
                new Job(2,1,10),
                new Job(3,1,40),
                new Job(4,1,30)
        };

        for (int i: job.JobScheduling(jobs,n)) {
            System.out.print(i+" ");
        }
    }
}
