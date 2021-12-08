package array.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays/1
public class UnionOfTwoSortedArray {

//    ArrayList<Integer> findUnion(int[] a, int[] b, int n, int m){
//        ArrayList<Integer> arrList = new ArrayList<>();
//
//        int i = 0, j = 0;
//        //check for small element from both array and add it into arraylist
//        while(i < n && j < m){
//            if(a[i] < b[j]){
//                arrList.add(a[i]);
//                i++;
//            }else if(b[j] < a[i]){
//                arrList.add(b[j]);
//                j++;
//            }else{
//                arrList.add(b[j]);
//                i++;
//                j++;
//            }
//        }
//
//        while (i < n){
//            arrList.add(a[i]);
//            i++;
//        }
//
//        while (j < m){
//            arrList.add(b[j]);
//            j++;
//        }
//        return arrList;
//    }

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
    }
}
