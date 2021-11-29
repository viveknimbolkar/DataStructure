package array;

public class SmallerThanX {

    int immediateSmaller(int[] arr, int X){
        int result = 0;
        // find all the smaller elements than X and store it into the result
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < X){
                result = Math.min(arr[i],result);
            }
        }
        return arr[result];
    }
    public static void main(String[] args) {
        SmallerThanX smallerThanX = new SmallerThanX();
        int[] arr = {4,67,13,12,15};
        int X = 12;
        System.out.println(smallerThanX.immediateSmaller(arr,X));
    }
}
