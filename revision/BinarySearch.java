package revision;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int find = 8;

        System.out.println(binarySearchIterative(arr,find, 0, arr.length-1));
    }

    private static int binarySearchIterative(int[] arr, int find, int start, int end) {
       while (end-start > 1){
           int mid = (end+start) / 2 ;
           if (arr[mid] < find)
               start = mid+1;
           else end = mid;
       }
        if (arr[start] == find) return start;
        if (arr[end] == find) return end;
        else return -1;
    }

    private static int binarySearch(int[] arr, int find,int start, int end) {
        if (start < end){
            int mid = start+(end-start)/2;

            if (arr[mid] == find) return mid;

            if (arr[mid] > find) return binarySearch(arr,find,start, mid-1);
            return binarySearch(arr,find,mid+1, end);
        }
        return -1;
    }

}
