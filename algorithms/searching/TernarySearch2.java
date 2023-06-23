package algorithms.searching;

public class TernarySearch2 {

    public static void main(String[] args) {
        TernarySearch2 ts2 = new TernarySearch2();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(ts2.ternarySearch(arr,0,arr.length-1,9));
    }

    private int ternarySearch(int[] arr, int l, int r, int key) {
        if (r >= l){
            // divide array into three part
            int mid1 = l+(r-l)/3;
            int mid2 = r-(r-l)/3;

            if (arr[mid1] == key)
                return mid1;
            if (arr[mid2] == key)
                return mid2;

            // search in first part
            if (key < arr[mid1])
                return ternarySearch(arr,l,mid1-1,key);
            else if (key > arr[mid2])
                // search in third part
                return ternarySearch(arr,mid2+1, r,key);
            // search in middle part
            else return ternarySearch(arr,mid1+1, mid2-1,key);

        }
        return -1;
    }
}
