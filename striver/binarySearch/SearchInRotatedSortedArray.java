package striver.binarySearch;
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRotatedSortedArray {

    // using binary search
    // Complexity : Time = O(longN) Space = O(1)
    int search(int[] arr, int target){
        int left = 0, right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target) return mid;

            // case when array contains duplicates
            if (arr[left] == arr[mid] && arr[mid] == arr[right]){
                left = left + 1;
                right = right - 1;
                continue;
            }

            // identify left sorted half
            if(arr[left] <= arr[mid]){
                    // search in left
                if(arr[left] <= target && target <= arr[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{ // idenitfy in right sorted half
                // search in right
                if(arr[mid] <= target && target <= arr[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        int[] nums = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(searchInRotatedSortedArray.search(nums,target));
    }
}
