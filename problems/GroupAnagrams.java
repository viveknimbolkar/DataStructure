package problems;

import java.util.*;

//https://leetcode.com/problems/group-anagrams/
public class GroupAnagrams {
    // method -1: by sorting
    List<List<String>> groupAnagrams(String[] str, int flag){
        // key is the str[i] string and value is the combination of that anagrams
        HashMap<String,List> map = new HashMap<>();

        for (int i = 0; i < str.length; i++) {
            char[] temp = str[i].toCharArray();
            Arrays.sort(temp);
            String s = new String(temp);

            if (map.containsKey(s)){
                map.get(s).add(str[i]);
            }else {
                List list = new ArrayList();
                list.add(str[i]);
                map.put(s,list);
            }
        }
        return new ArrayList(map.values());
    }

    // method - 2: without sorting
    List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for (String s: strs) {
            char[] dictionary = new char[26];
            for (char ch: s.toCharArray())
                dictionary[ch-'a']++;
            String ans = String.valueOf(dictionary);

            if (!map.containsKey(ans)) map.put(ans,new ArrayList<>());
            map.get(ans).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagrams group = new GroupAnagrams();
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(group.groupAnagrams(arr));
    }
}
