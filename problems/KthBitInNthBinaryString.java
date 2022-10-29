package problems;
//https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/
public class KthBitInNthBinaryString {

    char findKthBit(int n, int k) {
        String[] ans = new String[n+1];
        ans[0] = "0";
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i-1]+"1"+reverse(invert(ans[i-1]));
        }

        System.out.println(ans[n-1]);
        return ans[n-1].charAt(k-1);
    }

    String reverse(String bin){
       int i = 0, j = bin.length()-1;
       char[] arr = bin.toCharArray();
       while (i<j){
           char temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
       }
       return new String(arr);
    }

    // 0 --> 1 and 1 --> 0
    String invert(String bin){
        char[] ch = bin.toCharArray();
        for (int i = 0; i < ch.length; i++)
            if (ch[i]=='0') ch[i] = '1';
            else  ch[i] = '0';
        return new String(ch);
    }

    public static void main(String[] args) {
        KthBitInNthBinaryString kbit = new KthBitInNthBinaryString();
        int n = 3, k = 1;
        System.out.println(k+"th bit is: "+ kbit.findKthBit(n,k));
    }
}
