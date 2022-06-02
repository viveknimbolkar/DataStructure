package array.string;

import java.util.HashMap;

// https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/
public class EqualOccurances {

    boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        // store char with their frequency
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        // take temp array to compare same vlaues
        System.out.println(map);
        int[] temp = new int[map.size()];
        // add map values into temp array
        int i = 0;
        for (int val:map.values()) {
            temp[i++] = val;
        }

        boolean flag = false;
        if (temp.length == 1){
            return true;
        }
        // compare the values and output result
        for (int j = 0; j <= temp.length-2; j++) {
            if (temp[j] == temp[j+1]){
                flag = true;
            }else {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        EqualOccurances equalOccurances = new EqualOccurances();
        String s = "abacbc", b = "vvvvvvvvvv";
        System.out.println("Equal chars: "+equalOccurances.areOccurrencesEqual(b));
    }
}
