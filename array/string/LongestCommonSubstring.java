package array.string;
// https://leetcode.com/problems/longest-substring-without-repeating-characters/
import java.util.HashMap;

public class LongestCommonSubstring {

    int lengthOfLongestSubstring(String str){
        int result = 0;
        int left = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char value = str.charAt(i);
            // if value is already counted
            if (map.containsKey(value)){
                int foundAtIndex = map.get(value);
                left = Math.max(left,foundAtIndex+1);
            }
            // else add the key with increasing frequency
            result = Math.max(result,i-left-1);
            map.put(value,i);
        }
        return result;
    }

    public static void main(String[] args){
        LongestCommonSubstring lcs = new LongestCommonSubstring();
        String str = "abcabcbb";
        System.out.println("The length of longest common substring is: "+lcs.lengthOfLongestSubstring(str));
    }
}
