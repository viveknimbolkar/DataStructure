package array.problems;
//https://leetcode.com/problems/next-greater-element-i/
import java.util.HashMap;

public class NextGreaterElement2 {

    // Method - 1: Brute force O(n^2)
    int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // resultant array
        int[] ans = new int[nums1.length];

        // key: element, value: position in nums2 array
        HashMap<Integer,Integer> map = new HashMap<>();

        //store the positions of element
        for (int i = 0; i < nums2.length; i++)
            map.put(nums2[i],i);

        // build the resultant vector array
        for (int i = 0; i < nums1.length; i++)
            if (map.containsKey(nums1[i]))
                ans[i] = findGreaterElement(nums2,map.get(nums1[i]));

        return ans;
    }

    // find the next greater element after index
    int findGreaterElement(int[] arr, int index){
        for (int i = index+1; i < arr.length; i++)
            if (arr[i] > arr[index])
                return arr[i];
        return -1;
    }

    public static void main(String[] args) {
        NextGreaterElement2 next = new NextGreaterElement2();
        int[] nums1 = {4,1,2}, nums2 = {1,3,4,2};

        for (int x: next.nextGreaterElement(nums1,nums2)) {
            System.out.print(x+" ");
        }
    }
}
