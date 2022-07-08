package array.problems;

import java.util.Stack;

public class DailyTemperature {

    int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < temperatures.length-1; i++){
            while (!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
                ans[st.peek()] = i - st.peek();
                st.pop();
            }
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        DailyTemperature daily = new DailyTemperature();
        int[] temperatures = {73,74,75,71,69,72,76,73};

        for (int x: daily.dailyTemperatures(temperatures)) {
            System.out.print(x+" ");
        }
    }
}
