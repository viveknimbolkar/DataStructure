package striver.binarySearch;

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/ceil-the-floor2802/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=ceil-the-floor
class Pair{
    int floor, ceil;
    public Pair(int floor, int ceil){
        this.floor = floor;
        this.ceil = ceil;
    }
}
public class UpperBound {

    Pair getFloorAndCeil(int[] arr, int x) {
        Arrays.sort(arr);
        int floor = -1,ceil = -1;

        // find floor
        for(int i = 0; i < arr.length; i++){

            // find floor
            if(arr[i] >= x){
                if(floor == -1) floor = arr[i];
                else floor = Math.min(arr[i],floor);
            }

            // find ceil
            if(arr[i] <= x){
                ceil = Math.max(arr[i],ceil);
            }
        }
        return new Pair(ceil,floor);
    }

    public static void main(String[] args) {
        UpperBound findXInstance = new UpperBound();
//        int[] arr = {5, 6, 8, 9, 6, 5, 5, 6};
       int[] arr = { 6, 6, 10, 16, 17, 23, 24, 40, 42, 48, 49, 54, 56, 59, 64, 66, 77, 85, 93, 94, 98, 98, 100};
        int x = 42;
        System.out.println(findXInstance.getFloorAndCeil(arr,x).floor);
        System.out.println(findXInstance.getFloorAndCeil(arr,x).ceil);
    }
}
