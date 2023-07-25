package dsa450.array;
//https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1
import java.util.Arrays;

public class MergeTwoSortedArray {

    // first array i.e. b[] always contains the lesser elements than second arrayr i.e. b[]
    public void getMerge(int[] a, int[] b){
        int top = a.length -1, bottom = 0; // top is a[] and bottom is b[]

        while(top >= 0 && bottom < b.length){
            if (a[top] > b[bottom]){
                // a[] will only contain less element than b[]
                int temp = a[top];
                a[top] = b[bottom];
                b[bottom] = temp;
                top--;
                bottom++;
            }else break;
        }

        Arrays.sort(a);
        Arrays.sort(b);

    }

    public static void main(String[] args) {
    MergeTwoSortedArray merge = new MergeTwoSortedArray();
    int[] a = {1,3,5,7};
    int[] b = {0,2,6,8,9};
merge.getMerge(a,b);
        for (int x: a)
            System.out.print(x+" ");
        System.out.println();
        for (int x:b)
            System.out.print(x+" ");


    }
}
