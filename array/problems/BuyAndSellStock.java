package array.problems;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BuyAndSellStock {

    int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        int minProfit = Integer.MAX_VALUE, maxProfit = 0, ptr = 0;


        // get the first min profit day
        for(int i = 0; i < prices.length; i++){
            if (prices[i] < minProfit){
                minProfit = prices[i];
                ptr = i;
            }
        }

        // get the next max profit day
        for(int i = ptr; i < prices.length; i++){
            if (prices[i] > maxProfit) maxProfit = i;
        }
        System.out.println("MIn: "+minProfit+" "+"max: "+maxProfit);
        int profit = prices[maxProfit] - prices[minProfit];
        return (profit < 0)?0:profit;
    }

    public static void main(String[] args) {
        BuyAndSellStock buy = new BuyAndSellStock();
        int[] prices = {7,6,4,3,1};
        System.out.println("Max Profit: "+ buy.maxProfit(prices));
    }
}


