package array.matrix;
// https://leetcode.com/problems/find-the-town-judge/
public class TownJudge {

    int findJudge(int n, int[][] trust) {
        int judge = -1;

        return judge;
    }

    public static void main(String[] args) {
        TownJudge tj = new TownJudge();
        int[][] trust = {
                {1,3},
                {2,3},
                {3,1}
        };

        System.out.println("Town Judge is: "+tj.findJudge(trust.length, trust));
    }
}
