package array.problems;

// https://practice.geeksforgeeks.org/problems/last-index-of-15847/1/
public class LastLndexofOne {

    int findLastIndex(String s){
        int n = s.length();
        int index = -1;
        for (int i = n-1; i >= 0; i--) {
            if (s.charAt(i) == '1')
                return i;
        }
        return index;
    }

    public static void main(String[] args) {
        LastLndexofOne last = new LastLndexofOne();
        String str = "000101";
        System.out.println(last.findLastIndex(str));
    }
}
