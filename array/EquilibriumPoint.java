package array;

public class EquilibriumPoint {

    // Method 1: Brute force approach
    int getPoint(int[] arr){
        int leftSum ,rightSum;
        for (int i = 0; i < arr.length; i++) {
            leftSum = 0;
            //get left sum
            for (int j = 0; j < i; j++)
                leftSum+=arr[j];

            rightSum = 0;
            //get right sum
            for (int j = i+1; j < arr.length; j++)
                rightSum+=arr[j];

            //check equilibrium point
            if (leftSum == rightSum)
                return i;
        }
        return -1;
    }

    //Method 2: Get the sum of whole array and subtract each element one by one
    int getEquilibriumPoint(int[] arr){
        int sumOfWholeArr = 0;
        //get the sum of whole array
        for (int data: arr)
            sumOfWholeArr+=data;

        int currentSum = 0;
        //now iterate and subtract the current element from whole sum and check l==r
        for (int i = 0; i < arr.length; i++) {
            sumOfWholeArr = sumOfWholeArr - arr[i];
            //check equlib point
            if (currentSum == sumOfWholeArr)
                return i;
            currentSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        EquilibriumPoint equilibriumPoint = new EquilibriumPoint();
        int[] arr = {1,3,5,2,2};
        int[] arr2 = {20 ,17 ,42 ,25, 32 ,32 ,30 ,32, 37, 9, 2, 33 ,31 ,17 ,14 ,40, 9 ,12 ,36, 21, 8, 33, 6 ,6 ,10 ,37,
                12, 26 ,21 ,3};
        System.out.println(equilibriumPoint.getEquilibriumPoint(arr2));
    }
}
