package array.problems;
//https://www.codingninjas.com/studio/problems/alternate-numbers_6783445?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems&count=25&page=3&search=&sort_entity=order&sort_order=ASC&leftPanelTabValue=PROBLEM
import java.util.ArrayList;
import java.util.Collections;

public class AlternateNumber {

    // brute force - T=O(n+n/2) SC = O(n/2 + n/2) = O(n)
    int[] alternateNumbers(int []a) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // seperate negative and position
        for (int i = 0; i < a.length; i++) {
            if(a[i] < 0) neg.add(a[i]);
            else pos.add(a[i]);
        }

        // join pos-neg-pos-neg ...
        for (int i = 0; i < a.length/2; i++) {
            a[2*i] = pos.get(i);
            a[2*i+1] = neg.get(i);
        }
        return a;
    }

    //optimal - TC=O(n) SC = O(n)
    ArrayList<Integer> arrange(int[] a){

        int pos = 0, neg = 1;
        ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(a.length,0));

        for (int i = 0; i < a.length; i++) {
            if(a[i] < 0){
                list.add(neg,a[i]);
                neg += 2;
            }else{
                list.add(pos,a[i]);
                pos += 2;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        AlternateNumber alternateNumber = new AlternateNumber();
        int[] arr = {1,2,-4,-5};
        System.out.println(alternateNumber.arrange(arr));
    }
}
