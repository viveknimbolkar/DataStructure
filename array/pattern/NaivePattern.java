package array.pattern;
// https://www.geeksforgeeks.org/naive-algorithm-for-pattern-searching/
// https://leetcode.com/problems/implement-strstr/submissions/
public class NaivePattern {

    int findPattern(String text, String patt){
        int M = patt.length(); // pattern length i.e. window size
        int N = text.length(); // text length

        // run upto N-M time
        for (int i = 0; i <= N-M; i++) {
            int j;
            // slide window by one and every time check for pattern match
            for (j = 0; j < M; j++) {
                if (text.charAt(i+j) != patt.charAt(j)) break;
            }
            if (j == M)
                return i; // pattern found at i
        }
        return -1;
    }

    public static void main(String[] args) {
        NaivePattern naive = new NaivePattern();
        String text = "I like to code";
        String pattern = "code";

        System.out.println("Pattern found at index: "+naive.findPattern(text,pattern));
    }
}
