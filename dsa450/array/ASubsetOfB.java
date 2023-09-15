package dsa450.array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ASubsetOfB {
    public String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long,Long> hashMap = new HashMap<>();
        int val = 1;
        for (long i:a1) {
            if(hashMap.containsKey(i)){
                hashMap.put(i,hashMap.get(i)+val);
            }else{
                hashMap.put(i,Long.valueOf(i));
            }
        }

        for (long x:a2){
            if (hashMap.containsKey(x) && !(hashMap.get(x) == 0)) {
                hashMap.put(x,hashMap.get(x)-val);
            }else{
                return "No";
            }
        }
        return "Yes";

    }

    public static void main(String[] args) {
        ASubsetOfB ab = new ASubsetOfB();
        long a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
        long a2[] = {11, 3, 7, 1, 7};

        System.out.println(ab.isSubset(a1,a2,a1.length,a2.length));
    }
}
