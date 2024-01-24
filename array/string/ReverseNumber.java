package array.string;
//https://www.codingninjas.com/studio/problems/reverse-bits_2181102?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class ReverseNumber {
    long reverseBits(long n) {
        char[] buffer = Long.toBinaryString(n).toString().toCharArray();
        System.out.println("buffer "+buffer);
        rotateRecursively(buffer,0,buffer.length);
        for (char ch:
             buffer) {
            System.out.print(ch+" ");
        }
        String str = new String(buffer);
        System.out.println("Integer " + Integer.parseInt(str));

        return n;
    }

    void rotateRecursively(char[] buffer, int left, int right){
        if(left >= right/2) return;
        swap(buffer,left,right-left-1);
        rotateRecursively(buffer,left+1,right);
    }

    void swap(char[] arr,int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        ReverseNumber revNum = new ReverseNumber();
        long num = 12;
        System.out.println(Long.toBinaryString(num));
        System.out.println(revNum.reverseBits(num));
    }
}
