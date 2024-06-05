package striver.binarySearch;
//https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=number-of-occurrence
public class CountOccurances {

    // optimal using binary search
    // Complexity = Time = O(longN) Space = O(1)
    int count(int[] arr, int x){
        int left = bs(arr,x,true);
        if(left == -1) return 0; // element is not present in the array
        int right = bs(arr,x,false);

        return right - left + 1; // occurance
    }

    // binary search
    int bs(int[] arr, int x, boolean isSearchingLeft){
        int l = 0, r = arr.length - 1, idx = -1;

        while (l <= r){
            int m = l + (r - l) / 2;

            if(arr[m] > x){
                r = m -1;
            } else if (arr[m] < x) {
                l = m + 1;
            }else {
                idx = m;
                if(isSearchingLeft){
                    r = m - 1;
                }else{
                    l = m + 1;
                }
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        CountOccurances countOccurances = new CountOccurances();
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int x = 2;
        System.out.println("Occurance: "+ countOccurances.count(arr,x));
    }
}
