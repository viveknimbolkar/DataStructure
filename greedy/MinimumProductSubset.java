package greedy;
//https://www.geeksforgeeks.org/minimum-product-subset-array/
public class MinimumProductSubset {

    // 3 cases:
    // 1. even no. of negative & no zero in array => product of all no. except largest negative no.
    // 2. odd no. of negative & no zero => product of all nos.
    // 3. all zero & positivve no => zero product
    int findMinProduct(int[] arr){
        int n = arr.length;
        if (n == 0) return arr[0]; // array having single element

        // count the values of required variables
        int posMin = Integer.MAX_VALUE;
        int negMax = Integer.MIN_VALUE;
        int countZeros = 0, countNegative = 0, product = 1;

        for (int i = 0; i < n; i++) {
            // count zeros
            if (arr[i] == 0){
                countZeros++;
                continue;
            }

            // count negative
            if (arr[i] < 0){
                countNegative++;
                countNegative = Math.max(countNegative,arr[i]);
            }

            // count minimum positive number yet
            if (arr[i] > 0 && arr[i] < posMin)
                posMin = arr[i];

            product *= arr[i]; // get final product
        }

        // case 1
        if (countNegative % 2 == 0 && countNegative != 0)
            product = product/negMax;

        // case 2
        if (countNegative == 0) return posMin;

        // case 3
        if (countNegative == 0 || (countZeros > 0 && countNegative == 0))
            return 0;

        return product;
    }

    public static void main(String[] args) {
        MinimumProductSubset minimumProductSubset = new MinimumProductSubset();
        int[] a = { -1, -1, -2, 4, 3 };
        System.out.println("min product: "+minimumProductSubset.findMinProduct(a));
    }
}
