package array.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// https://leetcode.com/problems/group-anagrams/
public class GroupAnagrams {

    List<List<String>> groupAnagrams(String[] str){
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

    public static void main(String[] args) {
        GroupAnagrams group = new GroupAnagrams();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(group.groupAnagrams(strs));
    }
}
