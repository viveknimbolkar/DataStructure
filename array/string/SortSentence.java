package array.string;

// https://leetcode.com/problems/sorting-the-sentence/
public class SortSentence {

    String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] ans = new String[words.length];
        String res = "";

        for (String str:words) {
            int index = str.charAt(str.length()-1)-'0'-1;
            ans[index] = str.substring(0,str.length()-1);
        }
        return String.join(" ",ans);
    }

    public static void main(String[] args) {
        SortSentence sort = new SortSentence();
        String s = "is2 sentence4 This1 a3";
        System.out.println(sort.sortSentence(s));
    }
}
