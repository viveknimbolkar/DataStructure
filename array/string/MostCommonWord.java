package array.string;

import java.util.HashMap;

//https://leetcode.com/problems/most-common-word/
public class MostCommonWord {

    String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> map = new HashMap<>();
        String[] paragraphWords = paragraph.toLowerCase().split(" ");

        for (int i = 0; i < paragraphWords.length; i++) {
            if (map.containsKey(paragraphWords[i])){
                int count = map.get(paragraphWords[i]);
                map.put(paragraphWords[i],count+1);
            }else{
                map.put(paragraphWords[i],0);
            }
        }

        System.out.println(map);
        return "vivek";
    }

    public static void main(String[] args) {
        MostCommonWord most = new MostCommonWord();
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};

        System.out.println(most.mostCommonWord(paragraph,banned));
    }
}
