package dcscracker;
//TC = O(n)
public class MoveAllNegative {

    //Approach 1: iterate through every element and swap them
    public void moveAllNegative(int[] arr){
        int j = 0; //store the index of last value of all the positive integer
        int temp;

        //now check each and every element in an array
        for (int i = 0; i < arr.length; i++) {
            //if the i'th element is negative
            if (arr[i] < 0){
                //if the i and j are not pointing to the same index
                if (i != j){
                    //swap negative element with positive element
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++; // for all same values
            }
        }
    }

    void printArray(int[] arr){
        for (int x: arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    //Approach 2: keep track of two pointer and swap it (left......right)
    void shifeAll(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        int temp;

        while (left <= right){
            //if right and left element both are negative
            if (arr[left] < 0 && arr[right] < 0){
                left++; //increment the negative index
            }else if (arr[left] > 0 && arr[right] > 0){
                right--;
            }else if(arr[left] > 0 && arr[right] < 0){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }else {
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        MoveAllNegative move = new MoveAllNegative();

        int[] data = {-2,3,-21,6,8,5,-96,1,-23,-8,12,-65};
        //move.moveAllNegative(data);
        move.shifeAll(data);
        move.printArray(data);
    }
}
