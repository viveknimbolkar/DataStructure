package array.string;
//https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class ReverseWords {

    String reverseWords(String s) {
        String[] words = s.split(" ");

        StringBuilder sb = new StringBuilder();
        StringBuilder tempStr = new StringBuilder();

        for(String word: words){
            tempStr.append(word);
            tempStr.reverse();
            sb.append(tempStr.toString()+" ");
            tempStr.delete(0,tempStr.length());
        }
        sb.delete(sb.length()-1,sb.length());
        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseWords rev = new ReverseWords();
        String s = "Let's take LeetCode contest";
        System.out.println(rev.reverseWords(s));
    }
}
