package array.problems;

import java.util.Scanner;
import java.util.Vector;

// https://www.codechef.com/problems/MISSP
public class ChefandDoll {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> map = new Vector<Integer>();
        int testcase = sc.nextInt();

        for (int i = 0; i < testcase; i++) {
            int totalDolls = sc.nextInt();
            int doll;
            for (int j = 0; j < totalDolls; j++) {
                doll = sc.nextInt();
                if (doll > 0 && map.contains(doll))
                    map.removeElement(doll);
                else
                    map.add(doll);
            }

            for (int j = 0; j < map.size(); j++) {
                System.out.println(map.elementAt(i)+" ");
            }
        }

    }
}
