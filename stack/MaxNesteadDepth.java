package stack;
// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
public class MaxNesteadDepth {

    int maxDepth(String s) {
        int max = 0, count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('){
                count++;
                if (count > max) max = count;
            }else if (s.charAt(i) == ')') count--;
        }
        return max;
    }

    public static void main(String[] args) {
        MaxNesteadDepth max = new MaxNesteadDepth();
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println("Max Depth: "+max.maxDepth(s));
    }
}
