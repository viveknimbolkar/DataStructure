package problems;
//https://leetcode.com/problems/remove-all-occurrences-of-a-substring/
public class RemoveAllOccurrences {
    String removeOccurrences(String s, String part) {
        // replace first pattern in every iterations
        while (s.contains(part)){
            s = s.replaceFirst(part,"");
        }
        return s;
    }

    public static void main(String[] args) {
        RemoveAllOccurrences rao = new RemoveAllOccurrences();
        String s = "daabcbaabcbc", part = "abc";
        System.out.println(rao.removeOccurrences(s,part));
    }
}
