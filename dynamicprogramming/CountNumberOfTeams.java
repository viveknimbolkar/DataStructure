package dynamicprogramming;

import java.util.ArrayList;

//https://leetcode.com/problems/count-number-of-teams/
public class CountNumberOfTeams {

    // using single dp
    int numTeams(int[] rating, boolean flag){
        if (rating == null || rating.length == 0) return 0;
        int count = 0, n = rating.length;

        // initialize dp
        int[] dp = new int[n];

        // a[i] < a[j] < a[k]
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                // check withen a i to j range (increasing window)
                if (rating[i] > rating[j]){
                    dp[i]++;
                    count = count + dp[j];
                }
            }
        }

        dp = new int[n];
        // a[i] > a[j] > a[k]
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0 ; j--) {
                // increasing window from i to j
                if (rating[i] < rating[j]){
                    dp[i]++;
                    count = count + dp[j];
                }
            }
        }
        return count;
    }

    // brute force solution working
    int numTeams(int[] rating) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n = rating.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    ArrayList<Integer> temp = new ArrayList<>();

                    if (rating[i] < rating[j] && rating[j] < rating[k]){
                        temp.add(rating[i]);
                        temp.add(rating[j]);
                        temp.add(rating[k]);
                        list.add(temp);
                    } else if (rating[i] > rating[j] && rating[j] > rating[k]) {
                        temp.add(rating[i]);
                        temp.add(rating[j]);
                        temp.add(rating[k]);
                        list.add(temp);
                    }
                }
            }
        }

        System.out.println(list);
        return list.size();
    }

    public static void main(String[] args) {
        CountNumberOfTeams count = new CountNumberOfTeams();
        int[] rating = {2,5,3,4,1};
        int[] rating1 = {2,1,3};
        int[] rating2 = {1,2,3,4};
        System.out.println(count.numTeams(rating,true));
    }
}
