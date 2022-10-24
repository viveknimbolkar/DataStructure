package backtracking;

import java.util.ArrayList;

public class PrintingSubsequence {

    void printSubsequence(int index, ArrayList<Integer> sequence, int[] arr, int n){
        if (index > n){
            System.out.println(sequence);
            return;
        }
        // add the element into final answer
        sequence.add(arr[index]);
        printSubsequence(index+1,sequence,arr,n);
        sequence.remove(arr[index]);
        // remove the element into final answer
        printSubsequence(index+1,sequence,arr,n);
    }

    public static void main(String[] args) {
        PrintingSubsequence ps = new PrintingSubsequence();
        int n = 3;
        int[] arr = {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        ps.printSubsequence(0,list,arr,n);

    }
}
