package dsa450.array;
//https://leetcode.com/problems/merge-intervals/description/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {

    public int[][] mergeInterval(int[][] arr){
        if(arr.length == 0) return arr;
        List<int[]> list = new ArrayList<>();
        Arrays.sort(arr,(a,b)->a[0]-b[0]); // sort array on the basic of first index of every subarray

        // consider first sub array after sorting;
        int start = arr[0][0];
        int end = arr[0][1];

        for (int[] i: arr) {
            if (i[0] <= end){
                end = Math.max(end,i[1]);
            }else{
                // reach to the end of sub-interval
                list.add(new int[]{start,end});
                // update new start and end with the first and second element of current subarray
                start = i[0];
                end = i[1];
            }
        }
        list.add(new int[]{start,end}); // add the last interval because we are noew out of loop
        return list.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        MergeInterval merge = new MergeInterval();
        int[][] arr = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}};

        int[][] ans = merge.mergeInterval(arr);
        for (int[] x: ans) {
            for (int y:x) {
                System.out.print(y+" ");
            }
        }
    }
}
