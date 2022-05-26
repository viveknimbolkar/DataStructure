package array.string;
// https://leetcode.com/problems/shuffle-string/
public class ShuffleString {

    String restoreString(String s, int[] indices) {
        char[] ans = new char[s.length()];
        for (int i = 0; i < indices.length; i++)
            ans[indices[i]] = s.charAt(i);
        return new String(ans);
    }

    public static void main(String[] args) {
        ShuffleString shuffle = new ShuffleString();
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(shuffle.restoreString(s,indices));
    }
}
