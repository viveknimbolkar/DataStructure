package array;

public class RearrangeAnArray {

    void rearrange(int[] arr){
        int[] tempArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[arr[i]];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = tempArr[i];
        }
    }

    public static void main(String[] args) {
        RearrangeAnArray rar = new RearrangeAnArray();
        int[] arr = {4,0,2,1,3};
        rar.rearrange(arr);
    }
}
