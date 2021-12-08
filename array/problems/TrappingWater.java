package array.problems;

// https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1
public class TrappingWater {

    long trappingWater(int[] arr, int n){
        int totalWater=0;

        for (int i = 0; i < n; i++) {
            // find the maximum left height
            int leftMaxHeight = arr[i]; // initialize from current
            //iterate from current element to the left side to find the left max height
            for (int k = 0; k < i; k++) {
                //get max element from current and left iterating element
                leftMaxHeight = Math.max(leftMaxHeight,arr[k]);
            }

            // find the maximum left height
            int rightMaxHeight = arr[i]; // initialize from current
            //iterate from current element to the right side to find the right max height
            for (int k = i+1; k < n; k++) {
                //get max element from current and right iterating element
                rightMaxHeight = Math.max(rightMaxHeight,arr[k]);
            }
            //get the second smallest number and subtract it from current number to get the empty blocks
            totalWater = totalWater + Math.min(leftMaxHeight,rightMaxHeight) - arr[i];
        }
        return totalWater;
    }

    public static void main(String[] args) {
        TrappingWater tw = new TrappingWater();
        int[] arr = {3,0,0,2,0,4};
        System.out.println(tw.trappingWater(arr, arr.length));
    }
}
