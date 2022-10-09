package greedy;
//https://leetcode.com/problems/count-operations-to-obtain-zero/
public class CountOperationsToObtainZero {
    int countOperations(int num1, int num2) {
        int ans = 0;

        while (num1 != 0 && num2 != 0) {
            if (num1 <= num2) num2 -= num1;
            else if (num2 <= num1) num1 -= num2;
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        CountOperationsToObtainZero cout = new CountOperationsToObtainZero();
        int num1 = 0, num2 = 0;
        System.out.println(cout.countOperations(num1,num2));
    }
}
