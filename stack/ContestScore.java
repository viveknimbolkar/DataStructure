package stack;

import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/contest-score/0/
public class ContestScore {

    void score(String[] args){

    }

    public static void main(String[] args) {
        ContestScore contestScore = new ContestScore();
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int[] score;
        for (int i = 0; i < testcase; i++) {
            int days = sc.nextInt();
            score = new int[days];
            for (int j = 0; j < score.length; j++) {
                score[i] = sc.nextInt();
            }
            for (int x:score) {
                System.out.println(x);
            }
        }

    }
}
