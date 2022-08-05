package array.string;

import java.util.Arrays;

//https://leetcode.com/problems/find-the-difference/
public class FindDifference {

    char findTheDifference(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0;i < arr1.length ; i++)
            if(arr1[i] != arr2[i]) return arr2[i];

        return arr2[arr1.length];
    }

    public static void main(String[] args) {
        FindDifference find = new FindDifference();
        String s = "abcd", t = "abcde";
        System.out.println(find.findTheDifference(s,t));
    }
}
