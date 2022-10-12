package problems;
//https://leetcode.com/problems/calculate-money-in-leetcode-bank/
public class CalculateMoneyInLeetcodeBank {

    int totalMoney(int n) {
        int k = 0, j = 0;

        for (int i = 0; i < n; i++) {
            if (j > 7){
                j = 0;
                k++;
            }
            j++;
            System.out.println(j+" "+k);
        }

        return -1;
    }

    public static void main(String[] args) {
        CalculateMoneyInLeetcodeBank cal = new CalculateMoneyInLeetcodeBank();
        int n = 20;
        System.out.println(cal.totalMoney(n));
    }
}
