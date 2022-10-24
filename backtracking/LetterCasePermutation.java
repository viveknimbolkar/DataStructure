package backtracking;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/letter-case-permutation/
public class LetterCasePermutation {

    void solve(char[] arr, int index, List<String> ans){
        if (index == arr.length){
            ans.add(new String(arr));
            return;
        }

        // if it is a alphabet
        if(Character.isLetter(arr[index])) {
            if (Character.isUpperCase(arr[index])) {
                // if it is a character
                arr[index] = Character.toLowerCase(arr[index]); // make lowercase
                solve(arr, index + 1, ans);
                // backtrack
                arr[index] = Character.toUpperCase(arr[index]); // make uppercase
            } else {
                // if it is a number
                arr[index] = Character.toUpperCase(arr[index]); // make uppercase
                solve(arr, index + 1, ans);
                // backtrack
                arr[index] = Character.toLowerCase(arr[index]); // make lowercase
            }
        }

        solve(arr,index+1,ans);
    }

    List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        solve(s.toCharArray(),0,ans);
        return ans;
    }

    public static void main(String[] args) {
        LetterCasePermutation letter = new LetterCasePermutation();
        String str = "a1b2";
        System.out.println("get combinations: "+ letter.letterCasePermutation(str));
    }
}
