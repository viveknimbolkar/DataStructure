package problems;
//https://leetcode.com/problems/detect-capital/
public class DetectCapital {

    boolean detectCapitalUse(String word) {
        int l = 0, u = 0, lp = 0;

        // check for lowercase
        for (int i = 0; i < word.length(); i++)
            if (Character.isLowerCase(word.charAt(i))) l++;
        if (l == word.length()) return true;

        // check for uppercase
        u = 0;
        for (int i = 0; i < word.length(); i++)
            if (Character.isUpperCase(word.charAt(i))) u++;
        if (u == word.length()) return true;

        // check for pascalcase
        lp = 0;
        boolean firstLetter = Character.isUpperCase(word.charAt(0));
        for (int i = 1; i < word.length(); i++)
            if (Character.isLowerCase(word.charAt(i))) lp++;
        if (lp == word.length()-1 && firstLetter == true) return true;

        return false;
    }

    public static void main(String[] args) {
        DetectCapital detect = new DetectCapital();
        String word = "Leetcode";
        String word1 = "leetcode";
        String word2 = "LEETCODE";
        System.out.println("Is syntax right: "+detect.detectCapitalUse(word));
    }
}
