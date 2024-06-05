package striver.binarySearch;
//https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1?track=DSASP-Searching&amp%253BbatchId=154&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=floor-in-a-sorted-array
public class LowerBound {
    // Brute Force: Using Linear Search
    // Complexity: Time = O(N) Space = O(1)
    public int usingLinearSearch(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= x){
                return i;
            }
        }
        return arr.length;
    }

    //Optimal Solution: Using Binary Search
    // Complexity = Time = O(logN) Space = O(1)
    public int usingBinarySearch(int[] arr, int left, int right, int x){
        int ans = arr.length;
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] >= x){
                ans = mid;
                right = mid-1;
            }else{
                left = mid + 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        LowerBound findXInstance = new LowerBound();
        int[] arr = {3,5,8,15,19};
        int x = 9;
        System.out.println(findXInstance.usingLinearSearch(arr,x));
    }
}
