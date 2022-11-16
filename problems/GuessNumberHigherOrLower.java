package problems;
//https://leetcode.com/problems/guess-number-higher-or-lower/
public class GuessNumberHigherOrLower {
    int n, pick;
    GuessNumberHigherOrLower(int n, int pick){
        this.n = n;
        this.pick = pick;
    }

    // actual function to find number
    // applying binary search
    int guessNumber(int n) {
        int start = 1, end = n;

        while (start <= end){
            int mid = start+(end-start)/2; //find the mid element

            if (guess(mid) == 0) return mid; // found guessed number at mid
           else if (guess(mid) == -1) end = mid-1;
           else start = mid+1;
        }
    return -1; // never execute if guessed number not found
    }

    // function to give hint for a guessed number
    int guess(int num){
        if (num > this.pick) return -1;
        else if (num < this.pick)  return 1;
        else return 0;
    }

    public static void main(String[] args) {
        int n = 1420736637, pick = 20736637;
        GuessNumberHigherOrLower guess = new GuessNumberHigherOrLower(n,pick);
        System.out.println("Guessed Number: "+guess.guessNumber(n));
    }
}
