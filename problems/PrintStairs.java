package problems;

public class PrintStairs {

    void staircase(int n) {
        for (int i = 0; i < n ; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        PrintStairs pri = new PrintStairs();
        int n = 4;
        pri.staircase(n);
    }
}
