package array.problems;
//https://leetcode.com/problems/single-number/description/
//https://www.codingninjas.com/studio/problems/find-the-single-element_6680465?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse
public class SingleNumber3 {

    int findUsingLinearSearch(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) count++;
            }
            if(count == 1) return arr[i];
        }
        return -1;
    }

    // better approach
    int findUsingHashing(int[] arr, int n){
        // find max element
        int maxi = arr[0];
        for (int i = 0; i < n; i++)
            maxi = Math.max(maxi,arr[i]);

        // create and store in hash
        int[] hash = new int[maxi+1];
        for (int i = 0; i < n; i++)
            hash[arr[i]]++;

        for (int i = 0; i < n; i++) {
            if(hash[arr[i]] == 1) return arr[i];
        }

        return -1;
    }

    // optimal approach
    int findUsingXOR(int[] arr, int n){
        int result = 0;
        for (int i = 0; i < n; i++) {
            result ^= arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        SingleNumber3 single = new SingleNumber3();
        int[] arr = {1,1,2,3,3,4,4};
        System.out.println(single.findUsingXOR(arr,arr.length));
    }


}
