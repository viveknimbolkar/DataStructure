package array.problems;

import java.util.Arrays;
import java.util.HashSet;

public class LongestSuccessiveElements {

    boolean linearSearch(int[] a, int element){
        for(int x : a)
            if(x == element)
                return true;
        return false;
    }

    //brute force: T=(N*N) S=(1)
    int findConsecutiveLength(int[] arr){
        int longest = 1;

        for(int i = 0; i < arr.length; i++){
            int x = arr[i];
            int counter = 1;
            // keep looking x+i number if present in array
            while(linearSearch(arr,x+1) == true){
                x = x+1;
                counter = counter + 1;
            }
            longest = Math.max(longest,counter);
        }

        return longest;
    }

    // better : by sorting array
    // T=O(NlogN) S=O(1)
    int findLength(int[] a){
        Arrays.sort(a);
        int longest = 1, lastSmaller = Integer.MIN_VALUE, counter = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i]-1 == lastSmaller){
                counter = counter + 1;
                lastSmaller = a[i];
            }else if(a[i] == lastSmaller){
                continue;
            }else if(a[i] != lastSmaller){
                counter = 1;
                lastSmaller = a[i];
            }
            longest= Math.max(longest,counter);
        }
        return  longest;
    }

    // optimal: using set
    int findLengthUsingSet(int[] arr){
        int longest = 1, n = arr.length;
        HashSet<Integer> set = new HashSet<>();

        for (int e : arr){
            set.add(e);
        }

        for (int i = 0; i < n; i++) {
            int counter = 1;
            int x = arr[i];
            if(!set.contains(x-1)){
                while (set.contains(x+1)){
                    x = x + 1;
                    counter = counter + 1;
                }
            }
            longest = Math.max(longest,counter);
        }

        return longest;
    }
    public static void main(String[] args) {
        LongestSuccessiveElements longestElement = new LongestSuccessiveElements();
        int[] arr = {5,8,3,2,1,4};
        System.out.println(longestElement.findLengthUsingSet(arr));
    }
}
