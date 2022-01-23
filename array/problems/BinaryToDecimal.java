package array.problems;

public class BinaryToDecimal {

    String convertToDecimal(String binary){
        int longBinary = Integer.parseInt(binary);
        int remainder, base = 1, decimalNum = 0;

        while (longBinary > 0){
            remainder = longBinary % 10; // store the remainder (actual binary digit)
            decimalNum = decimalNum + remainder * base;
            longBinary = longBinary / 10; // divide number with quotient
            base = base * 2;
        }
        return String.valueOf(decimalNum);
    }

    public static void main(String[] args) {
        BinaryToDecimal bin = new BinaryToDecimal();
        String binary = "1010";
        System.out.println(bin.convertToDecimal(binary));
    }
}
