package revision.array.searching;

public class TernarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        int x = 6;
        System.out.println(ternarySearch(arr,x,0,arr.length-1));
    }

    private static int ternarySearch(int[] arr, int x, int start, int end) {
        if (end >= start){
            int mid1 = start + (end-start) / 3;
            int mid2 = end - (end-start) / 3;

            if (arr[mid1] == x) return mid1;
            if (arr[mid2] == x) return mid2;

            if (x < arr[mid1]){
                return ternarySearch(arr,x,start,mid1-1);
            }else if(x > arr[mid2]) return ternarySearch(arr,x,mid2+1,end);
            else return ternarySearch(arr,x,mid1+1,mid2-1);
        }
        return  -1;
    }
}
