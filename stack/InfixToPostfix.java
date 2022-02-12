package stack;

import java.util.Stack;

public class InfixToPostfix {
    //this method will return precedence of symbol
    int precedence(char ch){
        if (ch == '^'){
            return 1;
        }else if(ch == '*' || ch == '/'){
            return 2;
        }else if (ch == '+' || ch == '-'){
            return 3;
        }else {
            return -1;
        }
    }

    String infixToPostfix(String str){
        Stack<Character> stack = new Stack<>();
        String result ="";
        //reading the expression from left ot right
        for (int i = 0; i < str.length(); i++) {
            char currentCharacter = str.charAt(i); // get the current character from expression
            // if current character is a letter or digit then store into result
            if (Character.isLetterOrDigit(currentCharacter)){
                result += currentCharacter;
            }else if(currentCharacter == '('){
                stack.push(currentCharacter); // push character if it is opening bracket
            }else if (currentCharacter == ')'){
                //find the closing paranthesis and pop out everythign upto opening paranthesis
                while(!stack.isEmpty() && stack.peek() != '(' ){
                    result += stack.pop();
                }
                stack.pop(); // pop '('
            }else {
                // check for the precedence. if the precedence of the current character is less than the
                // top most character of stack then pop it and assign to the result
                while (!stack.isEmpty() && precedence(currentCharacter) <= precedence(stack.peek())){
                    result += stack.pop();
                }
                stack.push(currentCharacter);
            }
        }

        // pop all invalid paranthesis
        while (!stack.isEmpty()){
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        InfixToPostfix infixToPostfix = new InfixToPostfix();

        String expression = infixToPostfix.infixToPostfix("(a+b-c)");
        System.out.println(expression);
    }
}
