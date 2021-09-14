package dcscracker;

import java.util.Scanner;

public class MinimumHeight {

    void getMinDifference(int[] arr){

    }

    public static void main(String[] args) {
        MinimumHeight minHeight = new MinimumHeight();
        Scanner sc = new Scanner(System.in);

        System.out.print("No. of towers: ");
        int towers = sc.nextInt();
        System.out.print("Enter height of tower: ");
        int height = sc.nextInt();

        int[] towerList = new int[towers];

        for (int i = 0; i < towers; i++) {
            towerList[i] = sc.nextInt();
        }
    }
}
