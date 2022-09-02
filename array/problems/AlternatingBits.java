package array.problems;
//https://leetcode.com/problems/binary-number-with-alternating-bits/
public class AlternatingBits {

    boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
//        System.out.println(binary);
        for (int i = 0; i < binary.length()-1; i++)
            if (binary.charAt(i) == binary.charAt(i+1)) return false;

        return true;
    }

    public static void main(String[] args) {
        AlternatingBits alt = new AlternatingBits();
        int n = 5;
        System.out.println(alt.hasAlternatingBits(n));
    }
}
