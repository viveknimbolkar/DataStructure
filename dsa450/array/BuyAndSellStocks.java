package dsa450.array;

public class BuyAndSellStocks {

    //  brute force
    // t=O(n) s=O(1)
    public int buysell(int[] arr){
        int profit = 0, mini = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - mini;
            profit = Math.max(profit,diff);
            mini = Math.min(mini,arr[i]);
        }
        return profit;
    }

    public static void main(String[] args) {
        BuyAndSellStocks buyandsell = new BuyAndSellStocks();
        int[] price = {7,1,5,3,6,4};
        System.out.println(buyandsell.buysell(price));
    }
}
