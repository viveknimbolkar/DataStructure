package array.problems;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements2 {

    //Brute force
    // T = O(N^2) S=O(1)
    int findUsingBruteForce(int[] a, int n){
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] == a[i]) cnt++;
            }
            if (cnt >= n/2) return a[i];
        }
        return -1;
    }

    // Ushig hashing
    // T=O(NlongN) S=o(1)
    int findUsingHashing(int[] v, int n){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            int value = map.getOrDefault(v[i], 0);
            map.put(v[i],value+1);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue() > n/2) return entry.getKey();
        }
        return -1;
    }

    // Using Moore's voting algorithm
    int findUsingMooreAlgorithm(int[] a, int n){
        int count = 0, element = 0;

        for (int i = 0; i < n; i++) {
            // assuming that the current element is majority element
            if(count == 0){
                count = 1;
                element = a[i];
            }else if(a[i] == element) count++;
            else count--;
        }

        // check whether our assumption is correct or not
        int freq = 0;
        for (int i = 0; i < n; i++) {
            if(a[i] == element) freq++;
        }
        if(freq >= n/2) return element;
        return -1;
    }

    public static void main(String[] args) {
        MajorityElements2 maj = new MajorityElements2();
        int[] a = {2, 2, 1, 3, 1, 1, 3, 1, 1};
        System.out.println(maj.findUsingMooreAlgorithm(a,a.length));
    }
}
