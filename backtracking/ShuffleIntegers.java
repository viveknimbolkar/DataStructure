package backtracking;

import java.util.ArrayList;

//https://practice.geeksforgeeks.org/problems/shuffle-integers2401/1
public class ShuffleIntegers {

    void shuffleArray(long arr[], int n){
        ArrayList<Long> ans = new ArrayList<>();
        shuffle(arr,0,n,ans);

        // construct array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans.get(i);
        }
    }

    void shuffle(long[] arr, int i, int n, ArrayList<Long> ans) {
        if (i >= n/2) return;

        ans.add(arr[i]);
        ans.add(arr[n/2+i]);
        shuffle(arr,i+1,n,ans);
    }

    public static void main(String[] args) {
        ShuffleIntegers shuff = new ShuffleIntegers();
        int n = 4;
        long arr[] = {1, 2, 9, 15};
        shuff.shuffleArray(arr,n);

        for (long i: arr) {
            System.out.print(i+" ");
        }
    }
}
