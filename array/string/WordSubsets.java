package array.string;

import java.util.ArrayList;
import java.util.List;
//https://www.youtube.com/watch?v=ByQfvU8_fvM
//https://leetcode.com/problems/word-subsets/
public class WordSubsets {

    // Optimized Solution
    List<String> wordSubsets2(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        // count of character
        int[] target = new int[26];

        for (String b:words2) {
            // store the count of chars present in b'th string
            int[] temp = new int[26];

            for (char c : b.toCharArray()) {
                // c-'a' is the position of the char in string
                temp[c - 'a']++; // increment count of char in temp arr
                // now find the char having max count in b'th string and store it into target array
                target[c - 'a'] = Math.max(target[c - 'a'], temp[c - 'a']);
            }
        }
            // find the count of every char present in word1 string
            for (String a:words1) {
                int[] target2 = new int[26];
                // store the count of every char present in A string into target2 array
                for (char c: a.toCharArray()) {
                    target2[c-'a']++;
                }

                // find if target is the subset of target2 array
                if (subset(target2,target)){
                    ans.add(a);
                }
            }

        return ans;
    }

    boolean subset(int[] source, int[] dest){
        for (int i = 0; i < 26; i++) {
            if (dest[i] > source[i]) return false;
        }
        return true;
    }

    // Brute Force solution
    List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();

        // start traversing each word in words1 array
        for (int i = 0; i < words1.length; i++) {
            String str1 = words1[i];
            int flag = 0;

            // traverse string in words2
            for (int j = 0; j < words2.length; j++) {
                String str2 =  words2[j];
                // now traverse each char from str1 string
                for (int k = 0; k < str1.length(); k++) {
                    if (String.valueOf(str1.charAt(k)).equals(str2)){
                       flag++;
                       break;
                    }
                }
            }
            if (flag >= words2.length) ans.add(str1);
        }
        return ans;
    }

    public static void main(String[] args) {
        WordSubsets set = new WordSubsets();
        String[]  words1 = {"amazon","apple","facebook","google","leetcode"};
        String[] words2 = {"e","o"};

        System.out.println(set.wordSubsets2(words1,words2));

    }
}
