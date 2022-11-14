package problems;

import java.util.Stack;

//https://leetcode.com/problems/online-stock-span/
public class OnlineStockSpan {

    // this class represent stock along with their recent span
    static class StockWithSpan{
        int price, span;
        StockWithSpan(int price, int span){
            this.price = price;
            this.span = span;
        }
    }

    Stack<StockWithSpan> stack;
    OnlineStockSpan() {
        this.stack = new Stack<StockWithSpan>();
    }

    int next(int price) {
        int span = 1; // each span start with 1 day (current day span)

        // for every recent elemtn check for lowest value and increment psan
        while (!stack.isEmpty() && stack.peek().price <= price)
            span += stack.pop().span; // add the span of recent stock into stack

        stack.add(new StockWithSpan(price,span)); // add the stock and span into stack
        return span;
    }

    public static void main(String[] args) {
        OnlineStockSpan online = new OnlineStockSpan();

        // add prices
        System.out.println(online.next(100));
        System.out.println(online.next(80));
        System.out.println(online.next(60));
        System.out.println(online.next(70));
        System.out.println(online.next(60));
        System.out.println(online.next(75));
        System.out.println(online.next(80));

    }
}
