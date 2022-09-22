package array.string;
//https://leetcode.com/problems/percentage-of-letter-in-string/
public class PercentageofLetterInString {

    int percentageLetter(String s, char letter) {
        int freq = 0;
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) == letter) freq++;
        return (int)100*freq/s.length();
    }

    public static void main(String[] args) {
        PercentageofLetterInString per = new PercentageofLetterInString();
        String s = "foobar";
        char letter = 'o';
        System.out.println(per.percentageLetter(s,letter));

    }
}
