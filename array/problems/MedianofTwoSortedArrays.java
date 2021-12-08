package array.problems;

import predefined.PredefinedMethods;
// https://practice.geeksforgeeks.org/problems/median-of-2-sorted-arrays-of-different-sizes/1/
import java.util.Arrays;

public class MedianofTwoSortedArrays {
PredefinedMethods pre = new PredefinedMethods();


    double findMedian(int[] a, int[] b){
        int[] tempArr = new int[a.length+b.length];
        int tempLength = tempArr.length;

        System.arraycopy(a,0,tempArr,0,a.length);
        System.arraycopy(b,0,tempArr,a.length,b.length);
        Arrays.sort(tempArr);

        if (tempLength % 2 != 0){
            return tempArr[tempLength/2];
        }else {
            double mid = tempArr[tempLength/2] + tempArr[(tempLength-1)/2];
            return mid/2;
        }
    }

    public static void main(String[] args) {
        MedianofTwoSortedArrays median = new MedianofTwoSortedArrays();
        int[] a = {4,6};
        int[] b = {1,2,3,5};
        System.out.println(median.findMedian(a,b));

    }
}
