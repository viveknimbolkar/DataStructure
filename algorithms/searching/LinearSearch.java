package algorithms.searching;

public class LinearSearch {

    public int linearSearch(int[] array, int value){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        LinearSearch ls = new LinearSearch();

        int[] array = {1,324,523,6,34,32,76,9643,23};
        int result = ls.linearSearch(array, 3);

        if (result == -1)
            System.out.println("Element is not present.");
        else
            System.out.println("Element is present at: "+result);

    }
}
/*
Time complexity: O(n)
 */