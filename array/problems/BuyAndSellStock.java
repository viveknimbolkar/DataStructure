package array.problems;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
//https://www.codingninjas.com/studio/problems/893405?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTabValue=PROBLEM
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
        int profit = prices[maxProfit] - prices[minProfit];
        return (profit < 0)?0:profit;
    }

    // brute force - TC = O(N) SC = O(1)
     int findMaxProfit(int[] prices){
        int mini = prices[0], profit = 0;

        for (int i = 0; i < prices.length; i++) {
            int diff = prices[i] - mini;
            mini = Math.min(mini,prices[i]);
            profit = Math.max(profit,diff);
        }
        return profit;
    }

    public static void main(String[] args) {
        BuyAndSellStock buy = new BuyAndSellStock();
        int[] prices = {7,6,4,3,1};
        int[] prices2 = {1,100,150,120};
        System.out.println("Max Profit: "+ buy.findMaxProfit(prices2));
    }
}


