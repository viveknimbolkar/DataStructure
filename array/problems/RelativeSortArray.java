package array.problems;

import java.util.ArrayList;
import java.util.HashMap;
//https://leetcode.com/problems/relative-sort-array/
public class RelativeSortArray {


    // TODO: Incomplete
    int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i]))
                map.put(arr1[i],map.get(arr1[i])+1);
            else map.put(arr1[i], 1);
        }
        System.out.println(map);

        // build resultant array
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                int element = map.get(arr2[i]);
                System.out.println("element:  " + element);
                for (int j = 0; j < element; j++) {
                    ans.add(arr2[i]);
                }
                map.remove(arr2[i]);
            }
        }
        System.out.println(ans);
        System.out.println(map);
        return new int[3];
    }

    public static void main(String[] args) {
        RelativeSortArray rel = new RelativeSortArray();
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int [] arr2 = {2,1,4,3,9,6};

        for (int i: rel.relativeSortArray(arr1,arr2)) {
            System.out.print(i+" ");
        }
    }
}
