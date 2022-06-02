package array.string;

import java.util.ArrayList;
import java.util.HashMap;
// TODO: Incomplete
// https://leetcode.com/problems/rings-and-rods/
public class RingsAndRods {

    int countPoints(String rings) {
        // create rods to store rings
       ArrayList<Character> zero = new ArrayList<>();
        ArrayList<Character> one = new ArrayList<>();
        ArrayList<Character> two = new ArrayList<>();
        ArrayList<Character> three = new ArrayList<>();
        ArrayList<Character> four = new ArrayList<>();
        ArrayList<Character> five = new ArrayList<>();
        ArrayList<Character> six = new ArrayList<>();
        ArrayList<Character> seven = new ArrayList<>();
        ArrayList<Character> eight = new ArrayList<>();
        ArrayList<Character> nine = new ArrayList<>();

        // add color in rods
        for (int i = 0; i < rings.length()/2; i++) {
            switch (rings.charAt(i+1)){
                case '0': zero.add(rings.charAt(i));
                          break;
                case '1': one.add(rings.charAt(i));
                    break;
                case '2': two.add(rings.charAt(i));
                    break;
                case '3': three.add(rings.charAt(i));
                    break;
                case '4': four.add(rings.charAt(i));
                    break;
                case '5': five.add(rings.charAt(i));
                    break;
                case '6': six.add(rings.charAt(i));
                    break;
                case '7': seven.add(rings.charAt(i));
                    break;
                case '8': eight.add(rings.charAt(i));
                    break;
                case '9': nine.add(rings.charAt(i));
                    break;
            }
        }
        int count = 0;
        // count the rods
        if (zero.contains('R') && zero.contains('G') && zero.contains('B'))
            count++;
        if (one.contains('R') && one.contains('G') && one.contains('B'))
            count++;
        if (two.contains('R') && two.contains('G') && two.contains('B'))
            count++;
        if (three.contains('R') && three.contains('G') && three.contains('B'))
            count++;
        if (four.contains('R') && four.contains('G') && four.contains('B'))
            count++;
        if (five.contains('R') && five.contains('G') && five.contains('B'))
            count++;
        if (six.contains('R') && six.contains('G') && six.contains('B'))
            count++;
        if (seven.contains('R') && seven.contains('G') && seven.contains('B'))
            count++;
        if (eight.contains('R') && eight.contains('G') && eight.contains('B'))
            count++;
        if (nine.contains('R') && nine.contains('G') && nine.contains('B'))
            count++;

        return count;
    }

    public static void main(String[] args) {
        RingsAndRods ring = new RingsAndRods();
        String rings = "B0B6G0R6R0R6G9";
        System.out.println("Total valid rods: "+ring.countPoints(rings));
    }
}
