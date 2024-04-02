package striver.array;
//https://leetcode.com/problems/subarray-sum-equals-k/description/
//https://www.codingninjas.com/studio/problems/subarray-sums-i_1467103?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems&leftPanelTabValue=PROBLEM
public class SubarrayWithGivenSum {

    // brute force using two ptr approach
    // T = O(n^2) S = O(1)
    int count(int[] arr, int k){
        int ans = 0, n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
               sum += arr[j];
               if(sum == k) ans++;
            }
        }
        return ans;
    }

    // better solution using
    // T = O() S = ()
    int count2(int[] arr, int k){

return 34;
    }

    public static void main(String[] args) {
        SubarrayWithGivenSum sub = new SubarrayWithGivenSum();
        int[] arr = {2,3,1,4};
        int k = 4;
        System.out.println(sub.count(arr,k));
    }
}
