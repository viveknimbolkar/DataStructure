package array.problems;
// https://practice.geeksforgeeks.org/problems/maximum-in-struct-array/1
public class MaxInStructArray {

    static class Height{
            int feet;
            int inches;
            public Height(int ft, int inc){
                feet = ft;
                inches = inc;
            }
    }

    int findMax(Height[] arr, int size){
       // assume first height as maximun height
       int maxHeight = 12*arr[0].feet + arr[0].inches;

       int currentHeight=0;
        for (int i = 0; i < arr.length; i++) {
            currentHeight = 12*arr[i].feet + arr[i].inches;
            if (currentHeight>maxHeight)
                maxHeight = currentHeight;
        }
        return maxHeight;
    }

    public static void main(String[] args) {
        MaxInStructArray maxInStructArray = new MaxInStructArray();
        Height[] heightArr = {new Height(1,2),new Height(2,1)};
        maxInStructArray.findMax(heightArr, heightArr.length);
    }
}
