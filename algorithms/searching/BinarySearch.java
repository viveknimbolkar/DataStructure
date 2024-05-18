package algorithms.searching;
// O(logn)
//https://leetcode.com/problems/binary-search/description/
public class BinarySearch {

    //Method 1: Recursive method
    int binarySearch(int[] arr, int left, int right, int item){
        if (left <= right){
            int mid = left + (right - 1)/2;

            if (arr[mid] == item) return mid;

            //if the element is less than middle element then it is place in left side
            //because array is aleardy sorted
            if (arr[mid] > item)
                return binarySearch(arr, left, mid-1,item);
            //if element is present in right side then start from mid + 1 index
            return binarySearch(arr,mid+1,right,item);
        }
        return -1;
    }

    //Method 2: Using iterator
    int binarySearchIterator(int[] arr, int l,int r,int item){
        while (l<=r){
            int m = l +(r-1)/2;

            if (arr[m] == item)
                return m;
            if (arr[m] < item)
                l = m+1;
            else
                r = m-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] data = {1,2,3,4,5,6,7,8,9,10};
        int foundAt = binarySearch.binarySearchIterator(data,0,data.length,9);
        System.out.println(foundAt+1);
    }
}
