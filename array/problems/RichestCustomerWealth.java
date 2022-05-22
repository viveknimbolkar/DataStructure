package array.problems;
// https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth {

    int maximumWealth(int[][] accounts) {
        int sum = 0, max = 0;

        for (int i = 0; i < accounts.length; i++) {
            sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum+=accounts[i][j];
            }
            if (sum > max){
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        RichestCustomerWealth rich = new RichestCustomerWealth();
        int[][] accounts = {
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println("Wealth: "+rich.maximumWealth(accounts));
    }
}
