package array.string;
//https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
public class MostOneSegmentOfOnes {

    boolean checkOnesSegment(String s) {
        for (int i = 0; i < s.length()-1; i++)
            if (s.charAt(i) == '1' && s.charAt(i+1) == '1')
                return true;
        return false;
    }

    public static void main(String[] args) {
        MostOneSegmentOfOnes most = new MostOneSegmentOfOnes();
        String s = "1001";
        System.out.println("is 1 join present "+most.checkOnesSegment(s));
    }
}
