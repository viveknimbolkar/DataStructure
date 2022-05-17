package array.pattern;
// https://www.geeksforgeeks.org/kmp-algorithm-for-pattern-searching/
// https://www.youtube.com/watch?v=pu2aO_3R118
// https://www.youtube.com/watch?v=YZeNnnMQ69Y



// Imcomplete
public class KMPPattern {

    int kmpPattern(String str, String patt){
        int M = patt.length();
        int N = str.length();

        int[] lps = new int[M];
        // map the lps array of patterns i.e. preprocess the array
        computeLongestProperPrefix(patt,M,lps);

        return 1;
    }

    // this will compute or map the lps array
    void computeLongestProperPrefix(String pattern, int M, int[] lps){
        int len = 0;
        int i = 1;
        lps[0] = 0; // first element of lps is always zero

        while (i < M){
            // if the current character and last ith charater is matching
            if (pattern.charAt(i) == pattern.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else {
                // if len is > 0
                if (len != 0){
                    len = lps[len-1];
                }else{
                    // if len is 0
                    lps[i] = len;
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        KMPPattern kmp = new KMPPattern();
        String text = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        System.out.println("Pattern found at: "+kmp.kmpPattern(text,pat));
    }
}
