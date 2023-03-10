package array.problems;
//https://leetcode.com/problems/minimum-time-to-complete-trips/description/
public class MinimumTimeToCompleteTrips {
    long minimumTime(int[] time, int totalTrips) {
        int left = 1;
        int min = time[0];
        for (int t: time) {
            min = Math.min(t,min);
        }
        long right = totalTrips * min;

        while (left < right){
            long mid = (right-left)/2+left;
            long total = totalTimeInGivenTime(time,mid);
            if (total < totalTrips) left = min+1;
            else right = mid;
        }
        return left;
    }

    private long totalTimeInGivenTime(int[] time, long givenTime) {
        long totalTrips = 0l;
        for (int tripTime: time) {
            totalTrips += ((long)givenTime) /tripTime;
        }
        return totalTrips;
    }


    public static void main(String[] args) {
        MinimumTimeToCompleteTrips mintime = new MinimumTimeToCompleteTrips();
        int[] time = {1,2,3};
        int totalTrips = 5;
        System.out.println(mintime.minimumTime(time,totalTrips));
    }
}
