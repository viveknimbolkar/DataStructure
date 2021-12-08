package array.problems;


import java.util.ArrayList;
import java.util.HashSet;
// Find intersection between two arrays
public class FindIntersection {

    //Method: 1
    ArrayList<Integer> findIntersection(int[] a, int[] b){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]){
                    list.add(a[i]);
                }
            }
        }
        return list;
    }

    //Method: 2
    ArrayList<Integer> findIntersection2(int[] a, int[] b){
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for (int element:a) {
            s1.add(element);
        }
        for (int element:b) {
            s2.add(element);
        }
        s1.retainAll(s2);
        Object[] x = s1.toArray();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < x.length; i++) {
            list.add((Integer) x[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        FindIntersection find = new FindIntersection();
        int[] a = {1,2,3,4};
        int[] b = {2,4,6,7,8};
        System.out.println(find.findIntersection2(a,b));
    }
}
