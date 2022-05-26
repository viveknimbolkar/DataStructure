package array.problems;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class KidsWithCandies {
    List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> res = new ArrayList<>();
        int max = 0;

        //find the max element from the candies
        for (int i = 0; i < candies.length; i++)
            if (candies[i] > max)
                max = candies[i];

        for (int i = 0; i < candies.length; i++)
                if (candies[i]+extraCandies >= max)
                    res.add(true);
                else res.add(false);
        return res;
    }

    public static void main(String[] args) {
        KidsWithCandies kids = new KidsWithCandies();
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        for (Boolean b: kids.kidsWithCandies(candies,extraCandies)) {
            System.out.print(b+" ");
        }
    }
}
