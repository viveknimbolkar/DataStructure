package array.problems;

import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/missing-number/
public class MissingNumber {

    // Approach 1 (Brute Force)
    int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++)
            if(nums[i] != i) return i;

        return nums[nums.length-1]+1;
    }

    // Approach 2 (Using Hashing)
    int missingNumberUsingHashing(int[] nums, int n){
        int[] hash = new int[n+1];

        for (int i = 0; i < n-1; i++) {
            hash[nums[i]]++;
        }

        for (int i = 1; i < n; i++) {
            if(hash[i] == 0) return i;
        }
        return -1;
    }

    // Approach 3 (Using summation formula)
    int missingNumberUsingSummation(int[] nums, int n){
        int sum = n*(n+1)/2, totalSum = 0;
        for (int i = 0; i < n-1; i++) {
            totalSum += nums[i];
        }
        return sum - totalSum;
    }

//Approach 4 (Using XOR)
    int missingNumberUsingXOR(int[] nums, int n){
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < n-1; i++) {
            xor2 = xor2 ^ nums[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1 ^ n;
        return xor1 ^ xor2;
    }
    public static void main(String[] args) {
        MissingNumber mis = new MissingNumber();
        int N = 8;
        int[] nums = {1,2,3,4,5,6,8};
        System.out.println(mis.missingNumberUsingXOR(nums,N));
    }
}
