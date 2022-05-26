package array.problems;
// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
public class StringArrayMatching {

    boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = new String();
        String w2 = new String();

        for (int i = 0; i < word1.length; i++)
            w1+=word1[i];

        for (int i = 0; i < word2.length; i++)
            w2+=word2[i];

        System.out.println(w1+" "+w2);
        if (w1.equals(w2)) return true;
        return false;
    }

    public static void main(String[] args) {
        StringArrayMatching match = new StringArrayMatching();
        String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};

        System.out.println("Two strings are equal: "+match.arrayStringsAreEqual(word1,word2));
    }
}
