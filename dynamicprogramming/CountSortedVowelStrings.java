package dynamicprogramming;
//https://leetcode.com/problems/count-sorted-vowel-strings/
public class CountSortedVowelStrings {

    int a = 1, e = 1, i = 1, o = 1, u = 1; // could contains single combination
    int countVowelStrings(int n) {
        for (int j = 1; j < n; j++)
            findVowels();
        return a+e+i+o+u;
    }

     void findVowels() {
        a = a+e+i+o+u;
        e = e+i+o+u;
        i = i+o+u;
        o = o+u;
        u = u;
    }

    public static void main(String[] args) {
        CountSortedVowelStrings countvowel = new CountSortedVowelStrings();
        int n = 2;
        System.out.println("Possible ways: "+countvowel.countVowelStrings(n));
    }
}
