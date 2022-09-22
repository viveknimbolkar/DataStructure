package array.string;
//https://leetcode.com/problems/reverse-string-ii/
public class ReverseString2 {

    String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = s.length(), i = 0;

        while (i < n){
            reverse(arr,i,Math.min(i+k-1,n-1));
            i += 2*k;
        }
        return new String(arr);
    }

    // reverse string from start to end
    void reverse(char[] charr, int start, int end){
        if (start <= end){
            char temp = charr[start];
            charr[start] = charr[end];
            charr[end] = temp;
            reverse(charr,start+1,end-1);
        }
    }

    public static void main(String[] args) {
        ReverseString2 rs = new ReverseString2();
        String s = "abcdefg";
        int k = 2;
        System.out.println(rs.reverseStr(s,k));
    }
}
