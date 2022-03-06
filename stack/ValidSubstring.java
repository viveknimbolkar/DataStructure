package stack;

import java.util.Stack;
// TODO: incomplete
//https://practice.geeksforgeeks.org/problems/valid-substring0624/1/
public class ValidSubstring {

    int validateSubstring(String exp){
        int result = 0;
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        for(int i = 0; i< exp.length();i++){
            if(exp.charAt(i) == '('){
                s.push(i);
            }else{
                s.pop();
                if(!s.isEmpty()){
                    result = Math.max(result, i-s.peek());
                }else{
                    s.push(i);
                }
            }
        }
        return result;
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
