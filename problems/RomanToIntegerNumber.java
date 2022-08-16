package problems;

import java.util.HashMap;

//https://www.youtube.com/watch?v=dlATMslQ6Uc
//https://leetcode.com/problems/roman-to-integer
public class RomanToIntegerNumber {

    int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = map.get(s.charAt(s.length()-1)); // pick the last element

        for (int i = s.length() - 2; i >=0 ; i--) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                // if second element is greater than first then substract from result
                result -= map.get(s.charAt(i));
            }else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        RomanToIntegerNumber roman = new RomanToIntegerNumber();
        String romanName = "LVIII";
        System.out.println(roman.romanToInt(romanName));
    }

}
