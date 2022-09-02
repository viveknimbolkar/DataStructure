package array.problems;
//https://leetcode.com/problems/number-complement/
public class NumberComplement {

    int findComplement(int num) {
        // convert number to binary string
        String numBinary = Integer.toBinaryString(num);
        char[] tempArr = numBinary.toCharArray();

        // replace all zero with one and vice-versa
        for (int i = 0; i < numBinary.length(); i++)
            if (tempArr[i] == '0') tempArr[i] = '1';
            else tempArr[i] = '0';

        // get the complement by converting it into decimal
        int complement = Integer.parseInt(new String(tempArr), 2);

        return complement;
    }

    public static void main(String[] args) {
        NumberComplement nc = new NumberComplement();
        int n = 5;
        System.out.println("Complement of number is: "+nc.findComplement(n));
    }
}
