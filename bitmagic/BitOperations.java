package bitmagic;

public class BitOperations {

    // 1. right shift operator use to shift every single bit to right by one
    // 2. it is also use to divide no. by 2 (x >> 1)
    void rightShift(){
        int a = 10;
        int b = a >> 1;
        System.out.println(b);
    }

    // 1. left shift operator use to shift every single bit to left by one
    // 2. it is also use to multiply no. by 2 (x << 1)
    void leftShift(){
        int a = 10;
        int b = a << 1;
        System.out.println(b);
    }

    void swapNum(){
        int a = 10;
        int b = 20;

        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a: "+a+"\nb: "+b);
    }
    
    int setBit(int n, int k){
        return n | (1 << k);
    }

    int clearBit(int n, int k){
        int mask = ~(1 << k);
        return n & mask;
    }

    // check the bit at kth position is set or not
    boolean checkBitAtKPosiiton(int n, int k){
        int b = n & (1 << k);
        if(b != 0)
            return true;
        else
            return false;
    }

    void oddOrEven(){
        int x = 13; // odd
        int y = 20; // even

        if ((x & 1) == 0)
            System.out.println(x+" is even no.");
        else
            System.out.println(x+" is odd no.");
    }

    // find total count of set bits
    int countSetBits(int n){
        int setBits=0;
        for (int i = 10; i >= 0 ; i--) {
            if ((n & ( 1 << i)) != 0){
                setBits++;
            }
        }
        return setBits;
    }

    int binaryToGrayCode(int n){
        return n ^ (n >> 1);
    }

    int grayToBinary(int n){
        int binary = n;

        while(n > 0){
            n = n >> 1;
            binary = binary ^ n;
        }
        return binary;
    }

    public static void main(String[] args) {
        BitOperations bit = new BitOperations();
        System.out.println( bit.grayToBinary(4));
    }
}
