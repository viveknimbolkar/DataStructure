package problems;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> row, prev = null;
        // iterate rows upto numrows
        for (int i = 0; i < numRows; i++) {
            row = new ArrayList<>(); // create cols in list
            // we know that in pascal triangle row == col
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) row.add(1);
                else row.add(prev.get(j-1)+prev.get(j));
            }
            prev = row;
            triangle.add(row);
        }
        return triangle;
    }
    public static void main(String[] args) {
        PascalTriangle pascal = new PascalTriangle();
        System.out.println(pascal.generate(5));
    }
}
