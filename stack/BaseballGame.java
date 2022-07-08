package stack;
// https://leetcode.com/problems/baseball-game/
import  java.util.Stack;
public class BaseballGame {

    int calPoints(String[] ops){
        Stack<Integer> st = new Stack<>();
        int result = 0;
        char x = 34;

        for (int i = 0; i < ops.length; i++) {
            if (Character.isDigit(ops[i].charAt(0))){
            }else if (ops[i].charAt(0) == 'D'){
                int prev = st.peek();
                st.push(2*prev);
            } else if (ops[i].charAt(0) == 'C') {
                st.pop();
            } else if (ops[i].charAt(0) == '+') {
                
            }
        }

        return result;
    }


    public static void main(String[] args) {
        BaseballGame base = new BaseballGame();
        String[] ops = {"5","2","C","D","+"};
        System.out.println(base.calPoints(ops));
    }
}
