package array.problems;
//https://leetcode.com/problems/hamming-distance/
public class HammingDistance {

    int hammingDistance(int x, int y) {
        StringBuilder xBinary = new StringBuilder(Integer.toBinaryString(x));
        StringBuilder yBinary = new StringBuilder(Integer.toBinaryString(y));

        // find the count of binary digits which needs to be added to make both binares equal
        int len =  Math.max(xBinary.length(),yBinary.length()) - Math.min(xBinary.length(),yBinary.length());

        // add zeros to make two binaries equal
        if (xBinary.length() < yBinary.length())
            for (int i = 0; i < len; i++)
                xBinary.insert(0,'0');

        else if (yBinary.length() < xBinary.length())
            for (int i = 0; i < len; i++)
                yBinary.insert(0,'0');

        System.out.println(xBinary);
        System.out.println(yBinary);

        // count the total hamming distance
        int count = 0;
        for (int i = 0; i < xBinary.length(); i++)
            if (xBinary.charAt(i) != yBinary.charAt(i)) count++;

        return count;
    }

    public static void main(String[] args) {
        HammingDistance ham = new HammingDistance();
        int x = 1, y=4;
        System.out.println("Hammind distance: "+ham.hammingDistance(x,y));
    }
}
