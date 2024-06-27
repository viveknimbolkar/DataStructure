package striver.binarySearch;
//https://leetcode.com/problems/single-element-in-a-sorted-array/
public class SingleElementInSortedArray {

    // using linear search (brute force)

    // using xor
    // T = O(n) Space = O(1)
    // xor of same element is 0
    int singleNodeDuplicateUsingXOR(int[] arr){
        int ans = 0;
        for(int x : arr){
            ans ^= x;
        }
        return ans;
    }
    int singleNodeDuplicate(int[] arr){
        int n = arr.length;

        if(n == 1) return arr[0]; // array has one element only
        if(arr[0] != arr[1]) return arr[0]; // compare first two
        if(arr[n-1] != arr[n-2]) return arr[n-1]; // element in last two

        int left = 1, right = n - 2;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]){
                return arr[mid];
            }

            if((mid % 2 == 0 && arr[mid] == arr[mid + 1]) || (mid % 2 == 1 && arr[mid] == arr[mid - 1])){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        SingleElementInSortedArray single = new SingleElementInSortedArray();
        System.out.println(single.singleNodeDuplicateUsingXOR(arr));
    }
}
