package array.problems;
//https://leetcode.com/problems/maximum-product-of-three-numbers/
public class MaximumProductofThreeNumbers {

    char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) return letters[i];
        }
        return letters[0];
    }

    public static void main(String[] args) {
        MaximumProductofThreeNumbers maxNum = new MaximumProductofThreeNumbers();
        char[] letters = {'c','f','j'};
        char target = 'j';
        System.out.println(maxNum.nextGreatestLetter(letters,target));
    }
}
