package array.problems;
// https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {

    int searchInsert(int[] nums, int target) {
        boolean found = false;
        // check if the target element is present of not
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                found = true;
                return i; // targer found at i
            }
        }

        // if target not found then find its correct position
        if (!found){
            try{
                for (int i = 0; i < nums.length; i++) {
                    if (target < nums[i+1]) return i+1;
                }
            }catch (Exception e){
                return nums.length;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] data = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsertPosition.searchInsert(data,target));
    }
}
