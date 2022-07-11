package problems;
// https://leetcode.com/problems/sort-colors/
//https://www.youtube.com/watch?v=oaVa-9wmpns&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=5
public class SortZeroOneTwo {

    void sortColors(int[] nums){
        int temp = 0, low = 0, high = nums.length-1, mid = 0;
        // assumption is that all the items left to the low are 0's and all items right to the items are 2's
        while (mid <= high){
            switch (nums[mid]){
                case 0:
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
            }
        }
        return;
    }

    public static void main(String[] args) {
        SortZeroOneTwo sort = new SortZeroOneTwo();
        int[] nums = {2,0,2,1,1,0};
        sort.sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
