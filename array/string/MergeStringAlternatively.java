package array.string;
// https://leetcode.com/problems/merge-strings-alternately/
public class MergeStringAlternatively {

    String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < word1.length()+word2.length(); i++) {
            if (i < word1.length()) res.append(word1.charAt(i));
            if (i < word2.length()) res.append(word2.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        MergeStringAlternatively merge = new MergeStringAlternatively();
        String word1 = "abc", word2 = "pqr";
        System.out.println(merge.mergeAlternately(word1,word2));
    }
}
