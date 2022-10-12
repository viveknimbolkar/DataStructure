package array.string;

import java.util.Arrays;

//https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
public class CanMakeStringsEqual {
    boolean areAlmostEqual(String s1, String s2) {
        int[] s1arr = new int[26];
        int[] s2arr = new int[26];
        int counter = 0;

        for (int i = 0; i < s1.length(); i++){
            char a = s1.charAt(i);
            char b = s2.charAt(i);

            if (a != b) counter++;
            if (counter > 2) return false;

            s1arr[a-'a']++;
            s2arr[b-'a']++;
        }
        return Arrays.equals(s1arr,s2arr);
    }

    public static void main(String[] args) {
        CanMakeStringsEqual canmake = new CanMakeStringsEqual();
        String s1 = "bank", s2 = "kanb";
        System.out.println(canmake.areAlmostEqual(s1,s2));
    }
}
