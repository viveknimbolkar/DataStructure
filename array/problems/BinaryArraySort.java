package array.problems;
// https://practice.geeksforgeeks.org/problems/binary-array-sorting-1587115620/1/?
import predefined.PredefinedMethods;

public class BinaryArraySort {

    void binSort(int[] a){
        int ptr = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                int temp = a[i];
                a[i] = a[ptr];
                a[ptr] = temp;
                ptr++;
            }
        }
    }

    public static void main(String[] args) {
        PredefinedMethods method = new PredefinedMethods();
        BinaryArraySort bin = new BinaryArraySort();
        int[] arr = {1,0,1,1,0};
        bin.binSort(arr);
        method.printArray(arr);

    }
}
