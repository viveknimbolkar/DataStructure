package problems;
//https://leetcode.com/problems/determine-color-of-a-chessboard-square/
public class ColorOfChessboardSquare {
//    boolean squareIsWhite(String coordinates) {
//        boolean[][] chessboard = new boolean[8][8];
//
//        // 1 - white
//        // 0 - black
//        int k = 0;
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if (j%2!=0) chessboard[i][j] = true;
//                else chessboard[i][j] = false;
//                System.out.print(chessboard[i][j]+" ");
//            }
//            if (i%2==0){
//                k = 0;
//            }else k = 1;
//
//            System.out.println();
//        }
//        return false;
//    }


    boolean squareIsWhite(String coordinates) {
        char letter = coordinates.charAt(0);
        int digit = coordinates.charAt(1)-'0';

        // for odd square ie. white
        if (letter == 'a' || letter == 'c' || letter == 'e' || letter == 'g'){
            return digit%2 == 0;
        }else {
            return digit%2 == 1;
        }
    }

    public static void main(String[] args) {
        ColorOfChessboardSquare color = new ColorOfChessboardSquare();
        String coordinates = "a1";
        System.out.println("Is color white: "+color.squareIsWhite(coordinates));
    }
}
