package array.problems;

import array.rotation.OneByOne;

import java.util.Random;

public class ShuffleArray {
    Random random = new Random();

    // Method 1: Brute Force approach
    int[] shuffle(int[] arr){
        int arrSize = arr.length;
        for (int i = 0; i < arrSize-1; i++)
            arr[random.nextInt(arrSize-1)] = arr[random.nextInt(arrSize-1)];
        return arr;
    }

    //Method 2: swapping approach
    int[] shuffleBySwap(int[] arr){
        for (int i = arr.length-1; i >0 ; i--) {
            //random int from 0 to i (size of an array)
            int randomInt = random.nextInt(i+1);
            //swap random element from random index
            int temp = arr[i];
            arr[i] = arr[randomInt];
            arr[randomInt] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        ShuffleArray shuffleArray = new ShuffleArray();
        OneByOne oneByOne = new OneByOne();
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] shuffledArray = shuffleArray.shuffleBySwap(arr);

        oneByOne.printArray(shuffledArray);
    }
}
