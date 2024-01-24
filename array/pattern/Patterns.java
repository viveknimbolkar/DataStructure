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

    void printInvertedPattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2*n-(2*i+1); j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void printDiamondPattern(int n){
        // print pyramid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1 ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*n-2*i-1 ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    void printHalfDiamondStarPattern(int n){
        // print right angle triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // print inverted right angle triangle
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void printBinaryNumberTrianglePattern(int n,int approach){
        switch(approach){
            case 1:
                // approach 1: brute force
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < i; j++) {
                        if(i%2 == 0){
                            if(j%2 == 0)
                                System.out.print(0);
                            else
                                System.out.print(1);
                        }else{

                            if(j%2 == 0)
                                System.out.print(1);
                            else
                                System.out.print(0);
                        }
                    }
                    System.out.println();
                }
                break;

            case 2:
                // approach 2: using flag and store the value in (start) var
                int start = 1; // initial value is always 1
                for (int i = 0; i < n; i++) {
                    if(i % 2 == 0) start = 0;
                    else start = 1;

                    for (int j = 0; j < i; j++) {
                        System.out.print(start);
                        start = 1 - start;
                    }
                    System.out.println();
                }
                break;
        }
    }

    void increaseNumberPattern(int n)
    {
        int counter = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(counter++);
            }
            System.out.println();
        }
    }

    void printNumberCrownPattern(int n){
        int spaces = 2*n-1; // total spaces to add in each row
        for (int i = 1; i <= n; i++) {
            // print num in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            spaces -= 2;
        }
    }

    void printIncreasingLetterTrianglePattern(int n){
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A'+i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    void printReverseLetterTrianglePattern(int n){
        for (int i =0; i < n ; i++) {
            for (char j ='A'; j <= 'A'+(n-i-1); j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    void printAlphaRampPattern(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(int)('A'+i-1)+" ");
            }
            System.out.println();
        }
    }

    void printAlphaHillPattern(int n){
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            // alphabets
            char ch = 'A';
            int breakpoint = (2*i+1)/2; // to start reverse pattern
            for (int j = 1; j <= 2*i+1; j++) {
                System.out.print(ch+" ");
                if(j <= breakpoint) ch++;
                else ch--;
            }

            // spaces
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    void printAlphaTrianglePattern(int n){
        for (int i = 0; i < n ; i++) {
            for (char j = (char)(int)('A'+n-1-i); j <= (char)(int)('A'+n-1); j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    void printSymmentricVoidPattern(int n){

            // first print half reverse pattern
            int initialSpaces = 0;
        for (int i = 0; i < n; i++) {
            // start
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < initialSpaces; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            initialSpaces += 2;
            System.out.println();
        }

        // print pattern
        int initialSpaces2 = 2*n-2;
        for (int i = 0; i < n; i++) {
            // star
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 0; j < initialSpaces2; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            initialSpaces2 -= 2;
            System.out.println();
        }
    }

    void printSymmetricButterflyPattern(int n){
       int spaces = 2*n-2;
        for (int i =1; i <= 2*n-1; i++) {
            int stars = i; // for first half
            if(i > n) stars = 2*n-i; // for second half

            // star
            for (int j = 1; j <= stars ; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 1; j <= stars ; j++) {
                System.out.print("*");
            }
            if (i < n) spaces -= 2;
            else spaces += 2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Patterns patterns = new Patterns();
        int rows = 5;
        patterns.printSymmetricButterflyPattern(rows);
    }
}
