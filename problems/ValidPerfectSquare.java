package problems;
//https://leetcode.com/problems/valid-perfect-square/
public class ValidPerfectSquare {

    // apply binary search
    boolean isPerfectSquare(int num) {
        int left = 1, right = num;

        while (left <= right){

            int mid = left+(right-left)/2;
            int result = num/mid;
            int remainder = num%mid;

            if (remainder == 0 && result == mid) return true;
            else if(result > mid) left = mid+1;
            else right = mid-1;
        }
        return false;
    }

    public static void main(String[] args) {
        ValidPerfectSquare valid = new ValidPerfectSquare();
        int n = 15;
        System.out.println(valid.isPerfectSquare(n));
    }
}
