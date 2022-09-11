package array.string;
//https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/
public class PrefixofArray {

    boolean isPrefixString(String s, String[] words) {
        StringBuilder result = new StringBuilder();

        for (String word: words) {
            if (s.equals(result.toString())) return true;
            result.append(word);
//            System.out.println(result);
        }

        if (s.equals(result.toString())) return true;

        return false;
    }

    public static void main(String[] args) {
        PrefixofArray pre = new PrefixofArray();
        String s = "iloveleetcode";
        String[] words = {"i","love","leetcode","apples"};

        String str = "aaaaaaa";
        String[] wds = {"a","a","a","a","a","a","a"};

        System.out.println(pre.isPrefixString(str,wds));
    }
}
