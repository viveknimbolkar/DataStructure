package array.rotation;

public class CyclicRotation {

    //Method 1 shifting method
    void rotateOnce(int[] arr){
        int arrSize = arr.length;
        int lastElement = arr[arr.length-1];

        //shif all element one step right
        for (int i = arrSize-1; i > 0 ; i--)
            arr[i] = arr[i-1];
        arr[0] = lastElement;
    }

    //Method 2: using two pointers with swapping
    void rotateWithPointer(int[] arr){
        int i=0, j = arr.length-1;
        while (i!=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }

    public static void main(String[] args) {
        CyclicRotation cyclicRotation = new CyclicRotation();
        OneByOne oneByOne = new OneByOne();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        oneByOne.printArray(arr);
        cyclicRotation.rotateWithPointer(arr);
        oneByOne.printArray(arr);
    }
}
