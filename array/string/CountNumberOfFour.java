package array.string;

import dynamicprogramming.CountNumberOfTeams;

//https://practice.geeksforgeeks.org/problems/count-numbers-containing-43022/
public class CountNumberOfFour {

    int countNumberswith4(int N) {
        int count = 0;

        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder(""+i);
            if (sb.indexOf("4") != -1) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountNumberOfFour count = new CountNumberOfFour();
        int n = 44;
        System.out.println("nums: "+count.countNumberswith4(n));
    }
}
