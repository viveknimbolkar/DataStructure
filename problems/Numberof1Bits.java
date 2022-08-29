package problems;
//https://leetcode.com/problems/number-of-1-bits/
public class Numberof1Bits {

    int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;

        for (char ch: binary.toCharArray())
            if (ch == '1') count++;

        return count;
    }

    public static void main(String[] args) {
        Numberof1Bits num = new Numberof1Bits();
        int n = 00000000000000000000000000001011;
        System.out.println(num.hammingWeight(n));
    }
}
