package array.rotation;

public class BlockSwapAlgo {

    // Block swap using recursive method
    void leftRotate(int[] arr, int rotate, int arrsize){
        leftRotateRecursively(arr,0,rotate, arrsize);
    }

    void leftRotateRecursively(int[] arr, int i, int rotate, int arrSize){
        // base case
        if (rotate == 0 || arrSize == rotate) return;
        //if we have to rotate an half array
        if (arrSize - rotate == rotate){
            // swap whole half array
            swap(arr,i,arrSize - rotate + i,rotate);
            return;
        }

        // if A is shorter than B
        if (rotate < arrSize - rotate){
            //swap A elements into Bth correct location
            swap(arr, i,arrSize - rotate + i, rotate);
            //rotate array A
            leftRotateRecursively(arr,i, rotate, arrSize - rotate);
        }else {
            //If B is shorter
            swap(arr,i,rotate,arrSize - rotate);
            leftRotateRecursively(arr,arrSize - rotate +i,2 * rotate - arrSize, rotate);
        }
    }

    // Block swap using iterative method
    void leftRotateIterative(int[] arr, int rotate, int arrSize){
        int i = rotate, // array A
            j = arrSize - rotate; //array B

        while (i != j){
            if (i < j){
                // if A is shorter
                swap(arr,rotate-i, j+rotate-i, i);
                j = j - i;
            }else {
                // if b is shorter
                swap(arr,rotate-i, rotate,j);
                i = i - j;
            }
        }
        //block swap a and b
        swap(arr,rotate - i, rotate,i);
    }
    //swapping the element from fi to si with rotate
    void swap(int[] arr, int fi, int si, int rotate){
        int temp;
        for (int i = 0; i < rotate; i++) {
            temp = arr[fi + i];
            arr[fi + i] = arr[si + i];
            arr[si + i] = temp;
        }
    }


    public static void main(String[] args) {
        BlockSwapAlgo blockSwapAlgo = new BlockSwapAlgo();
        OneByOne oneByOne = new OneByOne();
        int[] arr = {1,2,3,4,5,6,7,8};
        int size = arr.length;

        oneByOne.printArray(arr);
        blockSwapAlgo.leftRotateIterative(arr,5,size);
        oneByOne.printArray(arr);

    }
}
