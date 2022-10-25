package backtracking;

import java.util.HashSet;

//https://leetcode.com/problems/letter-tile-possibilities/
public class LetterTilePossibilities {
    HashSet<String> numTilePossibilities(String tiles) {
        HashSet<String> set = new HashSet<>();
        boolean[] visited = new boolean[tiles.length()]; // prefix array for visited chars
        findPossibilities(tiles,"",set,visited);
        return set;
    }

    void findPossibilities(String tiles, String tempStr, HashSet<String> set, boolean[] visited) {
        set.add(tempStr);
        for (int i = 0; i < tiles.length(); i++) {
            if (!visited[i]){
                visited[i] = true; // mark the not visited as visited
                findPossibilities(tiles,tempStr+tiles.charAt(i),set,visited);
                visited[i] = false; // backtrack to get another combination
            }
        }
    }

    public static void main(String[] args) {
        LetterTilePossibilities letter = new LetterTilePossibilities();
        String tiles = "AAB";
        System.out.println("Possibilities: "+letter.numTilePossibilities(tiles));
    }
}
