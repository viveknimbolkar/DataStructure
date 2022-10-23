package array.problems;

import java.util.ArrayList;
import java.util.List;
//https://www.youtube.com/watch?v=tWnHbSHwNmA
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LetterCombinationsOfPhoneNumber {

    List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) return ans; // for empty strings
        String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder output = new StringBuilder("");
        int index = 0;
        findCombinations(digits,output,index,ans,mapping);
        return ans;
    }

    // backtracking : find the combinations
    private void findCombinations(String digits, StringBuilder output, int index, List<String> ans, String[] mapping) {
        // when we reach at the last index of digits
        if (index >= digits.length()){
            ans.add(output.toString());
            return;
        }

        int number = digits.charAt(index)-'0'; // get the char at index
        String value = mapping[number]; // get the mapping of respective number

        // recursively find the combinations
        for (int i = 0; i < value.length(); i++) {
            output.append(value.charAt(i));
            findCombinations(digits,output,index+1,ans,mapping); // make recursive calls
            output.deleteCharAt(output.length()-1); // backtrack
        }
    }


    public static void main(String[] args) {
        LetterCombinationsOfPhoneNumber letter = new LetterCombinationsOfPhoneNumber();
        String digit = "23";
        System.out.println(letter.letterCombinations(digit));
    }
}
