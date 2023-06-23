package dsa450.array;

public class FindMinAndMaxElement {

    public int minAndMax(int[] arr){
        int min , max ;

        // arr of single element
        if(arr.length == 1) return arr[0]+arr[0];

        // arr of 2 element

            if (arr[0]>arr[1]){
                max = arr[0];
                min = arr[1];
            }else {
                max = arr[1];
                min = arr[0];
            }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) max =  arr[i];
            else if( arr[i] < min) min = arr[i];
        System.out.println(min+" "+max);
        }
        return min+max;
    }

    public static void main(String[] args) {
        FindMinAndMaxElement find = new FindMinAndMaxElement();
        int[] arr = {34,2,65,23,1,3,78};
        int[] arr2 ={2, 3, 4, 5, 6};
        System.out.println(find.minAndMax(arr2));
    }
}
