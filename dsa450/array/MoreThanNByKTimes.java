package dsa450.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//https://www.geeksforgeeks.org/given-an-array-of-of-size-n-finds-all-the-elements-that-appear-more-than-nk-times/
public class MoreThanNByKTimes {

    public ArrayList<Integer> findNumbers(int[] arr,int k){
        int uptoSize = arr.length/k;
        ArrayList<Integer> ans = new ArrayList<>();
        // store number and frequency
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }else{
                hashMap.put(arr[i],1);
            }
        }
        System.out.println(hashMap);
        for (Map.Entry<Integer,Integer> entry: hashMap.entrySet()){
            if (entry.getValue() > uptoSize)
                ans.add(entry.getKey());
        }
        return ans;
    }

    public static void main(String[] args) {
        MoreThanNByKTimes more = new MoreThanNByKTimes();
        int[] arr = {3, 1, 2, 2, 1, 2, 3, 3};
        int k = 4;
        System.out.println(more.findNumbers(arr,k));
    }
}
