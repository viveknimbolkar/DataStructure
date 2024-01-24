package basichashing;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountHighestAndLowestFreq {

    int[] count(int[] arr, int n){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        System.out.println(map);

        int maxF = Integer.MIN_VALUE, minF = Integer.MAX_VALUE;
        int maxE = 0, minE = 0;

        Map<Integer,Integer> sortedMap = new TreeMap<>(map); // sort map
        System.out.println("sorted"+sortedMap);
        for (Map.Entry<Integer,Integer> entry : sortedMap.entrySet()){
            int element = entry.getKey();
            int freq = entry.getValue();

            if(freq > maxF){
                maxF = freq;
                maxE = element;
            }

            if(freq < minF){
                minF = freq;
                minE = element;
            }
        }

        return new int[] {maxE, minE};
    }
    public static void main(String[] args) {
        CountHighestAndLowestFreq countHighestAndLowestFreq = new CountHighestAndLowestFreq();
        int[] arr = {11 ,13 ,3 ,14, 17, 3 ,7 ,9 ,1, 11, 9, 15, 5, 2, 2 ,3 };

        for (int x: countHighestAndLowestFreq.count(arr,arr.length)) {
            System.out.print(x+" ");
        }
    }
}
