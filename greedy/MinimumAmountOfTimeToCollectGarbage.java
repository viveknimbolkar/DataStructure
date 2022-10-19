package greedy;
//https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/
//https://www.youtube.com/watch?v=zh8lX3UvM3c
public class MinimumAmountOfTimeToCollectGarbage {

    int garbageCollection(String[] garbage, int[] travel) {
        // store the last index of the type of garbage
        int pLastIndex = 0;
        int gLastIndex = 0;
        int mLastIndex = 0;
        int totalTime = 0;

        // find and update the values of tracker
        for (int i = 0; i < garbage.length; i++) {
            // get each and every type of garbage from the home
            for (char ch: garbage[i].toCharArray()) {
                if (ch == 'P') pLastIndex = i;
                else if (ch == 'G') gLastIndex = i;
                else if (ch == 'M') mLastIndex = i;
            }
            totalTime += garbage[i].length(); // get the total time required to collect and reach ith house
        }

        // calculate the totalt time travel time to reach the particular house
        for (int i = 1; i < travel.length; i++) {
            travel[i] = travel[i]+travel[i-1];
        }

        totalTime += pLastIndex == 0 ? 0 : travel[pLastIndex-1]; // store the last index of the p type garbase
        totalTime += gLastIndex == 0 ? 0 : travel[gLastIndex-1]; // store the last index of the p type garbase
        totalTime += mLastIndex == 0 ? 0 : travel[mLastIndex-1]; // store the last index of the p type garbase

        return totalTime;
    }

    public static void main(String[] args) {
        MinimumAmountOfTimeToCollectGarbage mintime = new MinimumAmountOfTimeToCollectGarbage();
        String[] garbage = {"G","P","GP","GG"};
        int[] travel = {2,4,3};
        System.out.println(mintime.garbageCollection(garbage,travel));
    }
}
