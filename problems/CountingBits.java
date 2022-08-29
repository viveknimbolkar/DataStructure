package problems;
//https://leetcode.com/problems/counting-bits/
public class CountingBits {

    int[] countBits(int n) {
        int[] ans = new int[n+1];
        int k = 0;
        for (int i = 0; i <= n; i++) {
            String binary = Integer.toBinaryString(i); // convert i into binary
//            System.out.println(binary); print the binary of i'th number

            int count = 0;
            for (char ch: binary.toCharArray()) {
                if (ch == '1') count++;
            }
            ans[k++] = count;
        }
        return ans;
    }

    public static void main(String[] args) {
        CountingBits countingBits = new CountingBits();
        int n = 2;
        for (int i: countingBits.countBits(n)) {
            System.out.print(i+" ");
        }

    }
}
