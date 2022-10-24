package backtracking;

public class IncreasingAndDecreasing {

    void increasingAndDescring(int n){
        if (n == 0) return;
        System.out.println(n); // straight forward
        increasingAndDescring(n-1);
        System.out.println(n); // straight backword
    }

    public static void main(String[] args) {
        IncreasingAndDecreasing indec = new IncreasingAndDecreasing();
        int n = 5;

        indec.increasingAndDescring(n);

    }
}
