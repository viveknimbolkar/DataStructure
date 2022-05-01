package array.rotation;

public class ReverseRecursively {

    void reverseRecursively(int[] arr, int left, int right){
       if (left >= right/2) return;
       swap(arr,left,right-left-1);
       reverseRecursively(arr,left+1,right);
    }

    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        ReverseRecursively reverse = new ReverseRecursively();
        int[] arr = {1,2,3,4,5,6,7};
        reverse.reverseRecursively(arr,0, arr.length);

        for (int x: arr) {
            System.out.print(x+" ");
        }
    }
}
