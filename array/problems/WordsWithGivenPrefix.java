package array.problems;
// https://leetcode.com/problems/counting-words-with-a-given-prefix/
public class WordsWithGivenPrefix {

    int prefixCount(String[] words, String pref) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < pref.length()) continue;
            //slice substring and compare with prefix
            if (words[i].substring(0,pref.length()).equals(pref)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        WordsWithGivenPrefix gp = new WordsWithGivenPrefix();
        String[] words = {"pay","attention","practice","attend"};
        String[] str = {"lewsmb","lewrydnve","lewqqm","lewec","lewn","lewb","lewedb"};
        String pref = "lew";
        System.out.println("Words found: "+gp.prefixCount(str,pref));
    }
}
