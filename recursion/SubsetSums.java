package recursion;

import java.util.ArrayList;
import java.util.Collections;

//https://practice.geeksforgeeks.org/problems/subset-sums2234/1
public class SubsetSums {

    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> subSet = new ArrayList<>();
        findSubset(0,0,N,arr,subSet);
        Collections.sort(subSet);
        return subSet;
    }

    void findSubset(int idx, int sum, int N, ArrayList<Integer> arr, ArrayList<Integer> subset){
        if (idx == N){
            subset.add(sum);
            return;
        }

        // pick the elemtn
        findSubset(idx+1, sum+arr.get(idx),N, arr,subset);
        // do not pick the element
        findSubset(idx+1, sum,N, arr,subset);
    }

    public static void main(String[] args) {
        SubsetSums sub = new SubsetSums();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(1);

        System.out.println(sub.subsetSums(arr,3));
    }
}
