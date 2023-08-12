package dsa450.array;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElement {

    ArrayList<Integer> commonElements(int A[], int B[], int C[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // add all items in lists
        for (int x: A) {
            list1.add(x);
        }
        for (int x: B) {
            list2.add(x);
        }
        for (int x: C) {
            list3.add(x);
        }

        for (int item: list1) {
            if (list1.contains(item) && list2.contains(item) && list3.contains(item)) {
                if (!ans.contains(item))
                ans.add(item);
            }
        }
        for (int item: list2) {
            if (list1.contains(item) && list2.contains(item) && list3.contains(item)) {
                if (!ans.contains(item))
                    ans.add(item);
            }
        }
        for (int item: list3) {
            if (list1.contains(item) && list2.contains(item) && list3.contains(item)) {
                if (!ans.contains(item))
                    ans.add(item);
            }
        }
        return ans;
    }

    public ArrayList<Integer> commonElementsUsingThreePointer(int[] a, int[] b, int[] c){
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length && k < c.length){
            if (a[i]==b[j] && b[j] == c[k]){
                ans.add(a[i]);
                i++;j++;k++;
            } else if (a[i] < b[j]) {
                i++;
            } else if (b[j] < c[k]) {
                j++;
            }else k++;

            // if all array elements are same
            int xx = a[i-1];
            while (a[i] == xx) i++;
            int yy = b[j-1];
            while (a[j] == yy) j++;
            int zz = c[k-1];
            while (c[k] == zz) k++;
        }

        return  ans;
    }

    public static void main(String[] args) {
        CommonElement com = new CommonElement();
        int[] A = {1, 5, 10, 20, 40, 80};
        int[]  B = {6, 7, 20, 80, 100};
       int[]   C = {3, 4, 15, 20, 30, 70, 80, 120};

        System.out.println(com.commonElementsUsingThreePointer(A,B,C));
    }
}
