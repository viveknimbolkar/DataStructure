package array.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/first-unique-character-in-a-string/
public class FirstNonRepetingString {

    int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        char[] chArr = s.toCharArray();
        int flag = 0;
        // add elemtns into map and list
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (map.containsKey(currentChar)){
                list.remove(Character.valueOf(currentChar));
                flag++;
            }else {
                map.put(currentChar,i);
                list.add(currentChar);
            }
        }

        if (list.size() != 0) return map.get(list.get(0));
        else return -1;
    }

    public static void main(String[] args) {
        FirstNonRepetingString first = new FirstNonRepetingString();
        String s = "leetcode";
        System.out.println("First Non-repeating string is: "+first.firstUniqChar(s));
    }
}
