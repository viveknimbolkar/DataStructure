package linkedlist.singly;
// https://practice.geeksforgeeks.org/problems/count-pairs-whose-sum-is-equal-to-x/1/
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class CountPairs {

    // Method 1: Brute Force Solution
    int countPairs(LinkedList<Integer> l1, LinkedList<Integer> l2, int x){
        int count = 0;
        for (int i = 0; i < l1.size(); i++)
            for (int j = 0; j < l2.size(); j++)
                if ((l1.get(i) + l2.get(j)) == x)
                    count++;
        return count;
    }

    //Method 2: Optimized method
    int countPairs2(LinkedList<Integer> l1, LinkedList<Integer> l2, int x){
        Iterator<Integer> itr1 = l1.iterator();
        int count = 0;
        while (itr1.hasNext()){
            Iterator<Integer> itr2 = l2.iterator();
            Integer l1Element = itr1.next();
            while (itr2.hasNext()){
                if ((l1Element + itr2.next()) == x)
                    count++;
            }
        }
        return count;
    }

    //Method: 3 Highly optimized solution
    int countPairs3(LinkedList<Integer> l1, LinkedList<Integer> l2, int x){
        HashSet<Integer> hash = new HashSet<>();
        int count = 0;

        for (Integer element: l1) {
            hash.add(element);
        }

        for (int i = 0; i < l2.size(); i++) {
            if (hash.contains(x - l2.get(i)))
                count++;
        }
        return count;
    }


    public static void main(String[] args) {
        CountPairs count = new CountPairs();
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();

        ll1.add(1);
        ll1.add(2);
        ll1.add(3);
        ll1.add(4);
        ll1.add(5);
        ll1.add(6);

        ll2.add(11);
        ll2.add(12);
        ll2.add(13);

        System.out.println(ll1+" "+ll2);
        System.out.println(count.countPairs2(ll1,ll2,15));

    }
}
