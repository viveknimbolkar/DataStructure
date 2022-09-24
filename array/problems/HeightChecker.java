package array.problems;

import java.util.Arrays;

//https://leetcode.com/problems/height-checker/
public class HeightChecker {

    int heightChecker(int[] heights) {
        int[] clone = heights.clone();
        Arrays.sort(clone);
        int count = 0;

        // count the height of both
        for (int i = 0; i < heights.length; i++)
            if (clone[i] != heights[i]) count++;

        return count;
    }

    public static void main(String[] args) {
        HeightChecker hei = new HeightChecker();
        int[]  heights = {1,1,4,2,1,3};
        System.out.println(hei.heightChecker(heights));
    }
}
