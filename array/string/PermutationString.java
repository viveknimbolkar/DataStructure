package array.string;

import java.util.Arrays;

// https://leetcode.com/problems/permutation-in-string/
public class PermutationString {

    // method-1: sort both string and compare them
    boolean checkInclusion(String s1, String s2){
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();

        // Sort both array
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);

        //compare each and every char
        for (int i = 0; i < s1Arr.length-1; i++) {
            if (s1Arr[i] != s2Arr[i]) return false;
        }
        return true;
    }

    // method-2: sliding window technique
    boolean checkInclusion(String s1, String s2, boolean label){
        if(s1.length() > s2.length()) return false;

        int[] freq = new int[26];
        char[] c = s1.toCharArray();
        // preprocess s1 and store hash in freq table
        for(int i = 0; i < c.length; i++){ freq[c[i]-'a']--;}

        int left = 0, right = s1.length()-1;
        for(int i = left; i <= right; i++)
            freq[s2.charAt(i) - 'a']++;

        if(check(freq)) return true;

        while(right < s2.length() - 1){
            freq[s2.charAt(++right) - 'a']++;
            freq[s2.charAt(left++) - 'a']--;
            if(check(freq)) return true;
        }
        return false;
    }

    // check the frequency of each char
    boolean check(int[] freq) {
        for (int f : freq) if (f != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        PermutationString permu = new PermutationString();
        String s1 = "testa";
        String s2 = "test";
        System.out.println(permu.checkInclusion(s1,s2));
    }
}
