package dcscracker;
// O(n)
public class ReverseArray {

    //reverse an array in iterative way
    public static void reverseArray(int[] arr, int start, int end){
        int temp;
        while(start < end){
            //swap end value to the start and vice versa
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    //reverse an array in recursively way
    public static void reverseArrayRecursively(int[] arr, int start, int end){
        int temp;

        //exit point
        if (start >= end) return;
        //swap end value to the start and vice versa
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArrayRecursively(arr,start+1,end-1);
    }


    //print array
    public void printArray(int[] arr){
        for (int x: arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        int[] data = {9,8,7,6,5,4,3,2,1};
        System.out.println("Original array: ");
        reverseArray.printArray(data);
        reverseArray(data,0,8);
        System.out.println("Iterative reversing: ");
        reverseArray.printArray(data);

        reverseArrayRecursively(data,0,8);
        System.out.println("Recursive reversing: ");
        reverseArray.printArray(data);

    }
}
