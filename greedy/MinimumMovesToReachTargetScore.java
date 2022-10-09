package greedy;
//https://leetcode.com/problems/minimum-moves-to-reach-target-score/
public class MinimumMovesToReachTargetScore {
    int minMoves(int target, int maxDoubles) {
        int moves = 0;

        while (target > 1){
            // when we have enough moves to double integer
            // any one step will be executed ie. eithe first or second
            if (target%2 == 0 && maxDoubles > 0){
                target /= 2;
                maxDoubles--;
            }else if(maxDoubles == 0){
                // now we don't have double moves, so increment by 1 each time and break
                moves+= target-1;
                break;
            }else target--;
            moves++;
        }

        return moves;
    }

    public static void main(String[] args) {
        MinimumMovesToReachTargetScore minmove = new MinimumMovesToReachTargetScore();
        int target = 10, maxDoubles = 4;
        System.out.println(minmove.minMoves(target,maxDoubles));
    }
}
