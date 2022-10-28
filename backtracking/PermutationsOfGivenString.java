package backtracking;

import java.util.ArrayList;
import java.util.List;

//https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1
public class PermutationsOfGivenString {
    // TODO: Not working
    List<String> findPermutation(String S) {
        List<String> ans = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        boolean[] visited = new boolean[S.length()];
        permute(S,temp,visited,ans);
        return ans;
    }

    private void permute(String s, StringBuilder temp, boolean[] visited, List<String> ans) {
        if (temp.toString().length() == ans.size()){
            ans.add(temp.toString());
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!visited[i]){
                visited[i] = true;
                temp.append(s.charAt(i));
                permute(s,temp,visited,ans);
                temp.deleteCharAt(temp.toString().length()-1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        PermutationsOfGivenString pergiv = new PermutationsOfGivenString();
        String str = "ABC";
        System.out.println(pergiv.findPermutation(str));
    }
}
