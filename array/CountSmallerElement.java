package array;
// https://practice.geeksforgeeks.org/problems/count-of-smaller-elements5947/1/
public class CountSmallerElement {

    long countOfElement(long[] arr, long size, long findMe){
        long count = 0;

        for(int i=0;i<size; i++){
            if(arr[i] <= findMe)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        CountSmallerElement countSmallerElement = new CountSmallerElement();
        long[] arr = {1, 2, 4, 5, 8, 10};
        System.out.println(countSmallerElement.countOfElement(arr ,arr.length, 9));
    }
}
