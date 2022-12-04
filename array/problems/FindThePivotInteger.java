package array.problems;
//https://leetcode.com/contest/weekly-contest-321/problems/find-the-pivot-integer/
public class FindThePivotInteger {

    int pivotInteger(int n) {
       int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            int temp = 0;
            for (int j = i; j <= n; j++) {
                temp += j;
            }
            if (temp == sum) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FindThePivotInteger findpivot = new FindThePivotInteger();
        int n = 8;
        System.out.println("Pivot: "+findpivot.pivotInteger(n));
    }
}
