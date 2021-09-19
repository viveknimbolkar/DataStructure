package algorithms.sorting;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class BucketSort {
    static void bucketSort(float[] arr){
        int arrSize = arr.length;

        // Initialize array of bucket using vector class of size arrSize
        Vector<Float>[] bucket = new Vector [arrSize];

        //create number of bucket of arrSize
        for (int i = 0; i < arrSize; i++) {
            bucket[i] = new Vector<Float>();
        }

        //now add arr elements into respective buckets
        for (int i = 0; i < arrSize; i++) {
            float bucketId = arr[i] * arrSize; // we getting the specific bucket name
            bucket[(int)bucketId].add(arr[i]); // casting float -> int to get specific (int)bucket id and add into bucket
        }

        //now sort each bucket
        for (int i = 0; i < arrSize; i++) {
            Collections.sort(bucket[i]); //applying insertion sort
        }

        // merge all the sorted bucket consecutive elements into arr[]
        int index = 0;
        for (int i = 0; i < arrSize; i++) {
            // get size of each bucket and merge it
            for (int j = 0; j < bucket[i].size(); j++) {
                arr[index++] = bucket[i].get(j);
            }
        }
    }

    public static void main(String[] args) {
        float[] data = {0.23f,0.53f,0.35f,0.48f,0.45f,0.12f,0.19f,0.83f,0.86f,0.94f};
        bucketSort(data);
        for (float x:data) {
            System.out.print(x+" ");
        }
    }
}
