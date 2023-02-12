package array.problems;

public class MaximumNumberOfIntegersToChooseFromARange {

    public int maxCount(int[] banned, int n, int maxSum) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (found(banned,i))
                continue;
            else{
                if (sum <= maxSum) {
                    if (found(banned,sum))
                        continue;
                    else sum += i;
                }else if (sum >= maxSum) return sum;
            }
        }
        return sum;
    }

    boolean found(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] banned = {1,6,5};
        int n = 5, maxSum = 6;
        MaximumNumberOfIntegersToChooseFromARange maxsum = new MaximumNumberOfIntegersToChooseFromARange();
        System.out.println(maxsum.maxCount(banned,n,maxSum));
    }
}
