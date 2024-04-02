package array.problems;
// https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
//https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399
import java.util.ArrayList;
import java.util.HashMap;

public class SubarrayWithGivenSum {
    // Brute force: Using 2 pointer approach
    int longestSubarrayWithSumK(int[] a, int n, int k){
        int len = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // find sum of subarray [i...j]
                int sum = 0;
                for (int l = i; l <= j; l++) {
                    sum += a[l];
                }
                if (sum == k)
                    len = Math.max(len, j-i+1); // store the max length subarray
            }
        }
        return len;
    }

    // Using Prefix sum (Hashing)
    int longestSubarrayWithSumKUsingHashing(int [] arr, int n,int k){
        int maxLen = 0, prefixSum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i]; // sum upto i

            if(prefixSum == k) maxLen = Math.max(maxLen,i+1); // max length till now

            int remainingSum = prefixSum - k;

            if (map.containsKey(remainingSum)){
                int len = maxLen = i - map.get(remainingSum); // calculate len of subarray a[i...j]
                maxLen = Math.max(maxLen,len);
            }else{
                map.put(prefixSum,i);
            }

        }
        return maxLen;
    }

    // Approach 3: Optimal (Using two pointers)
    int longestSubarrayWithSumKUsingTwoPointer(int[] a, int n, int k){
        int left = 0, right = 0, maxLen = 0, sum = a[0]; // init left and right from 0

        while(right < n){
            // trim down until sum < k
            while (left <= right && sum > k){
                sum -= a[left];
                left++;
            }
            if(sum == k) maxLen = Math.max(maxLen,right-left+1); // add the length of current subarray
            // increase right and add it
            right++;
            if(right < n) sum += a[right];
        }
        return maxLen;
    }

    ArrayList<Integer> subArraySum(int[] arr, int s, int n){
        ArrayList<Integer> tempArr = new ArrayList<>();

        int current_sum=arr[0];
        int start=0;

        for(int j=1; j<=n; j++){
            // get subarray having sum greater than S (find that subarray)
            while(current_sum > s && start < j-1){
                current_sum = current_sum-arr[start];
                start++;
            }
            // if we found s and subarray then add first starting index and last index of that
            // subarray
            if(current_sum == s){
                tempArr.add(start+1);
                tempArr.add(j);
                return tempArr;
            }

            if(j<n){
                current_sum=current_sum + arr[j];
            }
        }
        tempArr.add(-1);
        return tempArr;
    }

    public static void main(String[] args) {
        SubarrayWithGivenSum subarrayWithGivenSum = new SubarrayWithGivenSum();
        int[] arr = {1,2,3,1,1,1,1};
        int k = 3;

        System.out.println(subarrayWithGivenSum.longestSubarrayWithSumKUsingTwoPointer(arr,arr.length,k));
    }
}
