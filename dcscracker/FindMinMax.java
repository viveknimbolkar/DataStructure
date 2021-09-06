package dcscracker;

public class FindMinMax {

    static class Pair{
        int min,max;
    }

    //find the minimum and maximum element in an array
    private Pair getMinMax(int[] arr) {
        Pair pair = new Pair();
        //check if array has only one element
        if (arr.length == 1){
            pair.min = arr[0];
            pair.max = arr[0];
        }

        //initialize min and max values by comparing first 2 items
        if (arr[0] < arr[1]){
            pair.min = arr[0];
            pair.max = arr[1];
        }else {
            pair.min = arr[1];
            pair.max = arr[0];
        }

        /*now iterate through array to find min and max element
        if the element is greater than max then change it to arr[i] and do the same for min
        */
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < pair.min){
                pair.min = arr[i];
            }else if (arr[i] > pair.max){
                pair.max = arr[i];
            }
        }
        return pair;
    }

    public static void main(String[] args) {
        FindMinMax findMinMax = new FindMinMax();
        int[] data = {45,78,23,5623,84,2,8672,21,3};
        Pair minmax = findMinMax.getMinMax(data);
        System.out.println("Min element: "+minmax.min+"\nMax element: "+minmax.max);
    }
}

/*
Another method: We can sort an array and return first and last value as max and min respectively.
 */