package array.problems;

import java.util.*;

// https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays/1
public class UnionOfTwoSortedArray {

    int findUnion2(int[] a, int[] b, int n, int m){
        HashSet<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < n; i++)
            set.add(a[i]);


        for (int i = 0; i < m; i++)
            set.add(b[i]);


        return set.size();
    }

    //use set
    ArrayList<Integer> findUnion(int[] a, int[] b, int n, int m){
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> arrlist = new ArrayList<>();
        Iterator<Integer> iter = set.iterator();

        int i = 0, j = 0;
        while(i < n){
            set.add(a[i]);
            i++;
        }

        while(j < m){
            set.add(b[j]);
            j++;
        }

//        while (iter.hasNext()) {
//            arrlist.add(iter.next());
//        }
        System.out.println(arrlist);

        return arrlist;
    }

    public static void main(String[] args) {
        UnionOfTwoSortedArray setOperation = new UnionOfTwoSortedArray();
        int[] a = {1,2,3,4,5,6};
        int[] b = {1,2,3};
        ArrayList<Integer> result = setOperation.findUnion(a,b,a.length,b.length);
        System.out.println(result);
        System.out.println(setOperation.findUnion2(a,b,a.length,b.length));
    }
}
