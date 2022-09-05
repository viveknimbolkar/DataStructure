package array.string;
//https://leetcode.com/problems/reverse-string-ii/
public class ReverseFirstKCharacters {

    String reverseStr(String s, int k) {
        // if the string is lesser than k size
        if (s.length() < k) {
            StringBuilder sb = new StringBuilder(s);
            return sb.reverse().toString();
        }
        // resultant array
        char[] ans = s.toCharArray();
        // make first k element reverse
        reverse(ans,0,k-1);
        return new String(ans);
    }

    // reverse the element from start to end
    void reverse(char[] charr, int start, int end){
        if (start <= end){
            char temp = charr[start];
            charr[start] = charr[end];
            charr[end] = temp;
            reverse(charr,start+1,end-1);
        }
    }

    public static void main(String[] args) {
        ReverseFirstKCharacters first = new ReverseFirstKCharacters();
        String s = "abcdefg";
        int k = 2;
        System.out.println(first.reverseStr(s,k));
    }
}
