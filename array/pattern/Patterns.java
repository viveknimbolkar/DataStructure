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

    public static void main(String[] args) {
        Patterns patterns = new Patterns();
        int rows = 5;
        patterns.printReverseDownwardTriangle(rows);
    }
}
