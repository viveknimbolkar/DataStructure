package array.problems;

import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1/
public class FindMinAndMax {
    class pair
    {
        long first, second;
        public pair(long first, long second)
        {
            this.first = first;
            this.second = second;
        }
    }

    pair getMinMax(int[] arr){
        Arrays.sort(arr);
        long min = arr[0];
        long max = arr[arr.length-1];
        return new pair(min,max);
    }

    public static void main(String[] args) {
        FindMinAndMax findMinAndMax = new FindMinAndMax();
        int[] arr = {3, 2, 1, 56, 10000, 167};
        pair p = findMinAndMax.getMinMax(arr);
        System.out.println("min: "+p.first+" max :"+p.second);
    }
}
