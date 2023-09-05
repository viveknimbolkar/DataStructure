package dsa450.array;

import java.util.ArrayList;

public class RearrangeArrayElements {

    // variety 1 : negative elements === positive elements
    public void rearrange(int[] arr){
        int[] ans = new int[arr.length];
        int negIndex = 1, posIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                ans[negIndex] = arr[i];
                negIndex += 2;
            }else{
                ans[posIndex] = arr[i];
                posIndex += 2;
            }
        }
        
    }

    // variety 2 : negative elements !== positive elements
    public void rearrange2(int[] arr){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // store all pos and neg in respective array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                neg.add(arr[i]);
            }else{
                pos.add(arr[i]);
            }
        }

        if (pos.size() > neg.size()){
            // add all negative and positive in original arr
            for (int i = 0; i < neg.size(); i++) {
                arr[2*i] = pos.get(i); // all postivie at even index
                arr[2*i+1] = neg.get(i); // all negative at odd index
            }

            //add remaining positive elements
            int index = neg.size()*2;
            for (int i = neg.size(); i <pos.size() ; i++) {
                arr[index] = pos.get(i);
                index++;
            }

        }else {
            // add all negative and positive in original arr
            for (int i = 0; i < pos.size(); i++) {
                arr[2*i] = pos.get(i); // all postivie at even index
                arr[2*i+1] = neg.get(i); // all negative at odd index
            }

            //add remaining positive elements
            int index = pos.size()*2;
            for (int i = pos.size(); i <neg.size() ; i++) {
                arr[index] = neg.get(i);
                index++;
            }

        }
    }

    public static void main(String[] args) {
        RearrangeArrayElements rearr = new RearrangeArrayElements();
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        rearr.rearrange2(arr);
        for (int x: arr) {
            System.out.print(x+" ");
        }
    }
}
