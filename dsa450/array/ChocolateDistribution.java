package dsa450.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChocolateDistribution {

    long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        int minDiff = Integer.MAX_VALUE;
        int diff = 0;
        int i = 0;
        Collections.sort(a);
        while (i < n-m+1){
            diff = a.get(i+m-1)-a.get(i);
            minDiff = Math.min(diff,minDiff);
            i++;
        }
        return minDiff;
    }

    public static void main(String[] args) {
        ChocolateDistribution choco = new ChocolateDistribution();
        int N = 8, M = 5;
        Integer[] A = {3, 4, 1, 9, 56, 7, 9, 12};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(A));
        System.out.println(choco.findMinDiff(list,N,M));

    }
}
