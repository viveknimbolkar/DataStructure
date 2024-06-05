package striver.binarySearch;

import java.util.ArrayList;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FindFirstAndLastPosition {

    // using binary search
    // T = O(longN) Space = O(1)
    ArrayList<Integer> position(int[] arr, int target){
        ArrayList<Integer> ans = new ArrayList<>();

        int left = binarySearch(arr, target,true);
        int right = binarySearch(arr, target,false);

        ans.add(left);
        ans.add(right);

        return ans;
    }

    int binarySearch(int[] arr, int target, boolean isSearchingLeft){
        int left = 0;
        int right =  arr.length - 1;
        int idx = -1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] < target){
                left = mid + 1;
            }else if(arr[mid] > target){
                right = mid - 1;
            }else{
                idx = mid;
                if(isSearchingLeft){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }
        }

        return idx;
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
    FindFirstAndLastPosition find = new FindFirstAndLastPosition();
        System.out.println(find.position(nums,target));
    }
}
