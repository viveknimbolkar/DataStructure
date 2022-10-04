package greedy;
//https://www.geeksforgeeks.org/maximum-product-subset-array/
public class MaximumProductSubset {

    int getMaxProduct(int[] arr){
        int n = arr.length;
        if (n == 1) return arr[0];

        int maxNeg = Integer.MIN_VALUE;
        int product = 1, countNeg = 0, countZero = 0;

        for (int i = 0; i < n ; i++) {
            if(arr[i] == 0){
                countZero++;
                continue;
            }

            if (arr[i] < 0){
                countNeg++;
                maxNeg = Math.max(maxNeg,arr[i]);
            }

            product = product * arr[i];
        }

        if (countZero == n) return 0;

        // if odd number of negative element
        if (countZero % 2 == 1){
            if (countNeg == 1 && countZero > 0 && countZero+countNeg == n)
                return 0;
            product = product / maxNeg;
        }

        return product;
    }

    public static void main(String[] args) {
        MaximumProductSubset maps = new MaximumProductSubset();
        int[] a = {-1, -1, -2, 4, 3};
        System.out.println(maps.getMaxProduct(a));
    }
}
