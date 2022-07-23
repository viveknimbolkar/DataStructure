package array.problems;
//https://www.youtube.com/watch?v=m18Hntz4go8&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=41
//https://leetcode.com/problems/trapping-rain-water/
// https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1
public class TrappingWater {

    // Method-1: Brute Force
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

    //Method-2: Using Prefix-Suffix sum array
    int trap(int[] height) {
        int n = height.length; // total no. of towers
        int left = 0, right = n-1; // leftmost and rightmost tower
        int maxleft = 0, maxright = 0;
        int result = 0;

        while (left <= right){
            // if the height of left tower is less then rightmost tower
            if (height[left] <= height[right]){
                // if the current tower's height is greater than left max tower
                if (height[left] >= maxleft) maxleft = height[left];
                    // subtract the current tower from the left max tower to get trapped water
                else result += maxleft - height[left];

                left++; // move towards right
            }else {
                // if the current tower's height is greater than right max tower
                if (height[right]  >= maxright) maxright = height[right];
                // subtract the current tower from the right max tower to get trapped water
                else result += maxright - height[right];
                right--; // move towards left
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TrappingWater tw = new TrappingWater();
        int[] arr = {3,0,0,2,0,4};
        int[] towers = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(tw.trap(towers));
    }
}
