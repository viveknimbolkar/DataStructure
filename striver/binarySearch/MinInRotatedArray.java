package striver.binarySearch;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
public class MinInRotatedArray {

    // using binary search
    // Time = O(longN) Space = O(1)
    int findUsingBS(int[] arr){
        int left = 0, right = arr.length - 1, ans = Integer.MAX_VALUE;

        while(left <= right){
            int mid = left + (right - left) / 2;

            // if array already softed
            if(arr[left] <= arr[right]){
                ans = Math.min(ans,arr[left]);
            }

            // eleminate left half as it will no presetn in left and start searching in right
            if(arr[left] <= arr[mid]){
                ans = Math.min(ans,arr[left]);
                left = mid + 1;
            }else{
                ans = Math.min(ans,arr[mid]);
                right = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        MinInRotatedArray minEle = new MinInRotatedArray();

        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(minEle.findUsingBS(arr));

    }
}
