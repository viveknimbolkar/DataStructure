package dcscracker;

public class CyclicRotate {

    public static void main(String[] args) {
        CyclicRotate rotate = new CyclicRotate();

        int[] data = {1,2,3,4,5,6,7,8};

        rotate.printArray(data);
        rotate.rotateByOne(data);
        rotate.printArray(data);
    }

    /*
        1) Store last element in a variable say x.
        2) Shift all elements one position ahead.
        3) Replace first element of array with x.
    */
    void rotateByOne(int[] arr){
        int last = arr[arr.length-1];
        for (int i = arr.length-1; i > 0 ; i--)
            arr[i] = arr[i-1];
        arr[0] = last;
    }

    private void printArray(int[] arr) {
        for (int x: arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
