package array.string;

import java.util.ArrayList;

//https://leetcode.com/problems/reverse-vowels-of-a-string/
public class ReverseVowelsofString {

    String reverseVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<>();
        String ans = "";
        // get all the vowels and store them into chList
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))){
                vowels.add(s.charAt(i));
            }
        }

        int k = vowels.size()-1;
        // replace all the vowels in original string in reverse order
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))){
                ans += vowels.get(k--);
            }else {
                ans += s.charAt(i);
            }
        }

        return ans;
    }

    // check for given char vowel is not
    boolean isVowel(char ch){
        return switch (ch) {
            case 'a', 'A', 'E', 'e', 'i', 'I', 'o', 'O', 'u', 'U' -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        ReverseVowelsofString rev = new ReverseVowelsofString();
        String  s = "aA";
        System.out.println(s+" -> "+rev.reverseVowels(s));
    }
}
