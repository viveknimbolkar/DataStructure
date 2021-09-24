package algorithms.searching;

public class BinarySearch {

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

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] data = {1,2,3,4,5,6,7,8,9,10};
        int foundAt = binarySearch.binarySearch(data,0,data.length,9);
        System.out.println(foundAt+1);
    }
}
