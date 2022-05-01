package recursion;

public class ReverseArray {
    void reverseRecursively(int[] arr, int left, int right){
        if (left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            reverseRecursively(arr,left+1,right-1);
        }
    }

    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        int[] arr = {1,2,3,4,5,6};
        reverseArray.reverseRecursively(arr,0,arr.length-1);
        for (int x: arr)
            System.out.print(x+" ");
    }
}
