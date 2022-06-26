package array.string;
// https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {

    int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
    }

    public static void main(String[] args) {
        LengthOfLastWord len = new LengthOfLastWord();
        String str = "My name is vivek";
        System.out.println("Length of last word: "+len.lengthOfLastWord(str));
    }
}
