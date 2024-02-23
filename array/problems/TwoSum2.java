package array.problems;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum2 {
    // Brute force: using two loop
    String read(int n, int []book, int target){

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j ++){
                if(book[i]+book[j] == target)
                    return "YES";
            }
        }

        return "NO";
    }

    // Better appraoch: Using Hashing
    String read2(int n, int[] book, int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int needed = target - book[i]; // pages required to complete target
            if (map.containsKey(needed)){
                return "YES";
            }
            map.put(book[i],i);
        }
        return "NO";
    }

    // Optimal approach: Two pointer approach
    // T=O(n) + nlogn
    // S=O(n)
    String read3(int n, int[] book, int target){
        int left = 0, right = n-1;
        Arrays.sort(book);

        while (left < right){
            int sum = book[left] + book[right];
            if(sum == target){
                return "YES";
            }else if(sum < target)
                left++;
            else right++;
        }
        return "NO";
    }

    public static void main(String[] args) {
        TwoSum2 twoSum = new TwoSum2();
        int[] books = {4, 1, 2, 3, 1};
        int target = 5, n = books.length;
        System.out.println(twoSum.read3(n,books,target));
    }
}
