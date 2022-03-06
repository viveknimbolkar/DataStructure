package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1/

public class FirstNegativeofWindowK {

    public long[] getFirstNegativeInteger(long[] A, int N, int K){

        List<Long> tempArr = new ArrayList<>();
        boolean flag;

        for (int i = 0; i < N-K+1; i++) {
            flag = false;
            for (int j = 0; j < K; j++) {
                if (A[i+j] < 0){
                    tempArr.add(A[i+j]);
                    flag = true;
                    break;
                }
            }
            if (!flag) tempArr.add(0L);
        }
        long[] result = new long[N-K+1];

        for (int i = 0; i < tempArr.size(); i++) {
            result[i] = tempArr.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        FirstNegativeofWindowK find = new FirstNegativeofWindowK();
        long[] arr = {-8, 2, 3, -6, 10};
        int k = 2;

        long[] resultArr = find.getFirstNegativeInteger(arr,arr.length,k);

        for (int i = 0; i < resultArr.length; i++)
            System.out.println(resultArr[i]);

    }
}
