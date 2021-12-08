package array.problems;
// https://practice.geeksforgeeks.org/problems/index-of-an-extra-element/1/
public class IndexOfExtraElement {

    int findExtra(int[] arr1, int[] arr2){
        int i=0;
        int maxArrLength = Math.max(arr1.length,arr2.length);
        //iterate parallely and check for the elements
        for (i = 0; i < maxArrLength-1; i++)
            if (arr1[i] != arr2[i])
                return i;

       return i;
    }

    public static void main(String[] args) {
        IndexOfExtraElement idx = new IndexOfExtraElement();
        int[] arr1 = {2,4,6,8,9,10,12};
        int[] arr2 = {2,4,6,8,10,12};

        System.out.println(idx.findExtra(arr1,arr2));
    }
}
