package array.problems;

import java.util.*;

//https://leetcode.com/problems/top-k-frequent-words/
public class TopKFrequentWords {

    List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();

        // count the frequency of every word
        for(int i = 0; i < words.length; i++){
            if(map.containsKey(words[i])){
                map.put(words[i], map.get(words[i])+1);
            }else map.put(words[i], 0);
        }

        //sorting
        //if two words have the same frequency, then the word with the lower alphabetical order comes first.
        //else most frequent words will come first
        List<String> result = new ArrayList<>(map.keySet());

        Collections.sort(result,(w1,w2)-> map.get(w1).equals(map.get(w2)) ? w1.compareTo(w2) : map.get(w2) - map.get(w1));
        return result.subList(0,k);
    }

    public static void main(String[] args) {
        TopKFrequentWords topk = new TopKFrequentWords();
        String[]  words = {"i","love","leetcode","i","love","coding"};
    int k = 2;
        System.out.println(topk.topKFrequent(words,k));
    }
}
