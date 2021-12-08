package array.problems;
// https://practice.geeksforgeeks.org/problems/fighting-the-darkness3949/1/
public class FightningTheDarkness {

    long maxDays(long[] arr){
        long maxDays = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > maxDays)
                maxDays = arr[i];

        return maxDays;
    }

    public static void main(String[] args) {
        FightningTheDarkness fightningTheDarkness = new FightningTheDarkness();
        long[] arr = {1,1,2};
        System.out.println(fightningTheDarkness.maxDays(arr));
    }
}
