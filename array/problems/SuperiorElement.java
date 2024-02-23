package array.problems;

import java.util.ArrayList;
import java.util.List;
//https://www.codingninjas.com/studio/problems/superior-elements_6783446?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse&leftPanelTabValue=PROBLEM
public class SuperiorElement {

    // brute force : TC=O(N) SC=O(N)
    List< Integer > superiorElements(int []a){
        List<Integer> result = new ArrayList<>();
        int n = a.length;
        int maxYet = a[n-1], i = n-1;

        // reverse traverse
        do{
            if(i == n-1){
                result.add(maxYet);
            }
            // update when current element is greater than maxYet and simultaneously add into list
            if(a[i] > maxYet){
                maxYet = a[i];
                result.add(a[i]);
            }
            i--;
        }while(i > 0);

        return result;
    }
    public static void main(String[] args) {
        SuperiorElement superiorElement = new SuperiorElement();
        int[] arr = {1, 2, 3, 2};
        System.out.println(superiorElement.superiorElements(arr));
    }
}
