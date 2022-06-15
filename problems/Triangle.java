package problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// https://leetcode.com/problems/triangle/
public class Triangle {

    // Method-1: Brute Force
    int minimumTotal(List<List<Integer>> triangle, boolean flag) {
        int min = 0, minSum = 0;

        for (int i = 0; i < triangle.size(); i++) {
            Iterator itr = triangle.get(i).iterator();
            min = triangle.get(i).get(0);
            while (itr.hasNext()){
                int temp = (Integer) itr.next();
                if (temp < min){
                    min = temp;
                }
            }
            minSum += min;
            System.out.println("minSum: "+minSum);
        }
        return minSum;
    }

    // Method-2: DP
    int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 1) return triangle.get(0).get(0);
        int triangleSize = triangle.size();
        int[] arr = new int[triangleSize+1];
        for (int i = triangleSize-1; i >= 0 ; i--) {
            int m = triangle.get(i).size();
            for (int j = 0; j < m; j++) {
                arr[j] = Math.min(arr[j], arr[j+1]+triangle.get(i).get(j));
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {
        Triangle tri = new Triangle();
        List<List<Integer>> lists = new ArrayList<>();

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        List<Integer> l4 = new ArrayList<>();

        // row 1
        l1.add(-1);
        lists.add(l1);

        // row 2
        l2.add(2);
        l2.add(3);
        lists.add(l2);

        // row 3
        l3.add(1);
        l3.add(-1);
        l3.add(-3);
        lists.add(l3);

        // row 4
//        l4.add(4);
//        l4.add(1);
//        l4.add(8);
//        l4.add(3);
//        lists.add(l4);

        System.out.println("Minimum Path Sum: "+tri.minimumTotal(lists,true));
    }
}
