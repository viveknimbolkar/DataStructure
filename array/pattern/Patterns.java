package array.pattern;

public class Patterns {

    void printLeftTriangle(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }
    }

    void printReverseDownwardTriangle(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void printSquare(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void printRightTriangle(int n){
        for (int i = 0; i < n; i++) {
            //space decresing triangle
            for (int j = i; j <= n ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    void printHalfPyramidOfNum(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    void printPyramid(int n){
        // space = n-i-1
        // star = 2*i-1

        // itereate over row
        for (int i = 0; i < n; i++) {
            // print space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            // print star
            for (int k = 0; k < 2*i+1; k++) {
                System.out.print("*");
            }

            // print space
            for (int l = 0; l < n-i-1; l++) {
                System.out.print(" ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Patterns patterns = new Patterns();
        int rows = 5;
        patterns.printPyramid(rows);
    }
}
