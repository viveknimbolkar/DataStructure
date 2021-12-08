package array.problems;

import array.rotation.OneByOne;

import java.util.Stack;

public class StockSpanProblem {

    //Method 1: Using stack (WORKING)
    int[] findSpan(int[] price, int n){
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int[] tempArr = new int[n];

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && price[st.peek()] <= price[i])
                st.pop();

            if (st.empty())
                tempArr[i] = i+1;
            else
                tempArr[i] = i-st.peek();
            st.push(i);
        }
        return tempArr;
    }

    // Method 2: (Not working)
    int[] calculateSpan(int price[], int n) {
        int days = 0;
        int[] tempArr = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0 ; j--) {
                if (price[i] >= price[j])
                    days++;
                else break;
            }
            tempArr[i] = days;
        }
        return tempArr;
    }

    public static void main(String[] args) {
        StockSpanProblem stockSpanProblem = new StockSpanProblem();
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        OneByOne one = new OneByOne();
        one.printArray(stockSpanProblem.findSpan(arr,arr.length));
    }
}
