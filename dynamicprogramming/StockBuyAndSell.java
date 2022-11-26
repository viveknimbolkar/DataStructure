package dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/stock-buy-and-sell-1587115621/1?
public class StockBuyAndSell {

    ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int buy = 0;
        for (int i = 1; i <= n; i++) {
            // find the min element to (buy)
            if (i == n || A[i] < A[i-1]){
                // find the local maxima
                if ((A[i-1]-A[buy]) > 0){
                    // add the buy and sell index in ans
                    ans.add(new ArrayList<>(Arrays.asList(buy,i-1)));
                }
                buy = i; // make the current index as the next buying stock
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        StockBuyAndSell stock = new StockBuyAndSell();
        int N = 7;
        int A[] = {100,180,260,310,40,535,695};
        System.out.println(stock.stockBuySell(A,N));
    }
}
