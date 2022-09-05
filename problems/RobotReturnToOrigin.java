package problems;
//https://leetcode.com/problems/robot-return-to-origin/
public class RobotReturnToOrigin {

    boolean judgeCircle(String moves) {
        int horizontalMove = 0, veeticalMove = 0;
        for(int i = 0; i < moves.length(); i++){
            char move = moves.charAt(i);
            if(move == 'U') veeticalMove++;
            else if(move == 'D') veeticalMove--;
            else if(move == 'R') horizontalMove++;
            else if(move == 'L') horizontalMove--;
        }

        if(horizontalMove == 0 && veeticalMove == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        RobotReturnToOrigin rob = new RobotReturnToOrigin();
        String moves = "UD";
        System.out.println(rob.judgeCircle(moves));
    }
}
