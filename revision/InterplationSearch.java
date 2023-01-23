package revision;

public class InterplationSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int x = 9;
        System.out.println(interpolation(arr,x,0,arr.length-1));
    }

    private static int interpolation(int[] arr, int x, int low, int high) {
        int position;
        if (arr[low] <= x && arr[high] >= x && low <= high){
            position = low + (high-low)/(arr[high] - arr[low])*(x-arr[low]);
            if (arr[position] == x) return position;
            if (arr[position] < x)
                return interpolation(arr,x,position+1, high);
            if (arr[position] > x)
                return interpolation(arr,x,low,position-1);
        }
        return -1;
    }

}
