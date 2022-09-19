package array.problems;

import java.util.ArrayList;
import java.util.List;
//https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
public class BreakingTheRecords {

    List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> list = new ArrayList<>();
        int min = scores.get(0), max = scores.get(0);
        int high = 0, less = 0;
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) > max){ max = scores.get(i); high++;}
            if (scores.get(i) < min){
                min = scores.get(i);
                less++;
            }
        }

        System.out.println(max+" "+high);
        System.out.println(min+" "+less);
        list.add(high);
        list.add(less);
        return list;
    }

    public static void main(String[] args) {
        BreakingTheRecords brek = new BreakingTheRecords();
        int n = 9;
        List<Integer> score = new ArrayList<>();

        score.add(10);
        score.add(5);
        score.add(20);
        score.add(20);
        score.add(4);
        score.add(5);
        score.add(2);
        score.add(25);
        score.add(1);

        System.out.println(brek.breakingRecords(score));
    }
}
