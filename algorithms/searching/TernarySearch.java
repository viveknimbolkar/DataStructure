package algorithms.searching;

import java.util.Arrays;

public class TernarySearch {

    private static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while(low <= high) {
            int mid = low + high >>> 1;
            float midVal = a[mid];
            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                int midBits = Float.floatToIntBits(midVal);
                int keyBits = Float.floatToIntBits(key);
                if (midBits == keyBits) {
                    return mid;
                }

                if (midBits < keyBits) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -(low + 1);
    }

    public static void main(String[] args) {
        TernarySearch tt = new TernarySearch();
        float[] ar = {1.0f,2.2f,3.5f,4.6f,5.2f,6.78f,7.2f,8.9f,9.0f};
        System.out.println( tt.binarySearch(ar,0,ar.length-1,12.4f));
    }
}
