package stack;
//https://practice.geeksforgeeks.org/problems/evaluation-of-postfix-expression1735/1/
import java.util.Stack;

public class EvaluatePostfixExpression {

    int evaluate(String exp){
        Stack<Character> s = new Stack<>();
        return 1;
    }

    public static void main(String[] args) {
        EvaluatePostfixExpression eval = new EvaluatePostfixExpression();
        String exp = "231*+9-";
        System.out.println("After evaluation: "+eval.evaluate(exp));
    }
}
