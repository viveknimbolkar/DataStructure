package array.problems;
// https://leetcode.com/problems/truncate-sentence/
public class TruncateSentence {
    String truncateSentence(String s, int k) {
        StringBuilder ans = new StringBuilder();
        // split string into array
        String[] sArr = s.split(" ",0);
        for (int i = 0; i < k; i++) {
            // don't add space at last word
            if (i == k-1){
                ans.append(sArr[i]);
                break;
            }
            // normally add space in between two words
            ans.append(sArr[i]+" ");
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        TruncateSentence truncate = new TruncateSentence();
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncate.truncateSentence(s,k));
    }
}
