package stack;

import java.util.Stack;
// TODO: incomplete
//https://practice.geeksforgeeks.org/problems/valid-substring0624/1/
public class ValidSubstring {

    int validateSubstring(String exp){
        Stack<Character> s = new Stack<>();
        int length = 0;

        for (int i = 0; i < exp.length(); i++) {
            char ch  = exp.charAt(i);
            if (isLeftBracket(ch)){
                s.push(ch);
            }else if (ch == ')') {
                if (!s.isEmpty() && s.peek() == '('){
                    length++;
                    while (!s.isEmpty() && s.peek() != '(') {
                        s.pop();
                        length--;
                    }
                }
            }
        }
        return length;
    }

    boolean isLeftBracket(char ch){
        switch (ch){
            case '{':
            case '(':
            case '[':return true;
            default:return false;
        }
    }

    char getOppositeBracket(char lb){
        switch (lb){
            case '[':return ']';
            case ']':return '[';
            case '(':return ')';
            case ')':return '(';
            case '{':return '}';
            case '}':return '{';
            default:return '%';
        }
    }

    public static void main(String[] args) {
        ValidSubstring valid = new ValidSubstring();
        String s = "(()(";
        System.out.println("String length"+valid.validateSubstring(s));
    }
}
