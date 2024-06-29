package striver.binarySearch;

import java.util.Arrays;

//https://leetcode.com/problems/koko-eating-bananas/
public class KokoEatingBananas {

    // using linear search
    // Time = O() Space = O()
    int findMinBananas(int[] piles,int hours){
        Arrays.sort(piles);
        int pilesWithMaxBananas = piles[piles.length-1];

        for (int k = 1; k <= pilesWithMaxBananas; k++) {
            int hourlyBananas = calculate(piles,k);
            System.out.println("horuly Bananbas "+hourlyBananas);
            if(hourlyBananas <= hours)
                return k;
        }
        return -1;
    }

    // using binary search
    // Time = O(nlongn) space = O(1)
    int findMinBananasUsingBs(int[] piles, int hours){
        Arrays.sort(piles);
        int n = piles.length;
        int maxElement = piles[n-1];
        int left = 1, right = maxElement;

        while (left <= right){
            int mid = left + (right - left) / 2;
            int calculateHrRequired = calculate(piles,mid);
            if(calculateHrRequired <= hours)
                right = mid - 1;
            else left = mid + 1;
        }
        return left;
    }

    int calculate(int[] piles, int k){
        int totalHours = 0;
        for (int i = 0; i < piles.length; i++) {
            totalHours += Math.ceil((double) piles[i]/(double)k);
        }
        return totalHours;
    }
    public static void main(String[] args) {
        KokoEatingBananas koko =  new KokoEatingBananas();
        int[] piles = {3,6,7,11};
        int hours = 8;
        System.out.println(koko.findMinBananasUsingBs(piles,hours));

    }
}
