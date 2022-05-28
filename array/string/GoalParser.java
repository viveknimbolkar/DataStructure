package array.string;
// https://leetcode.com/problems/goal-parser-interpretation/
public class GoalParser {

    String interpret(String command) {
        String p1 = command.replace("()","o");
        String p2 = p1.replace("(","");
        return p2.replace(")","");

    }

    public static void main(String[] args) {
        GoalParser goal = new GoalParser();
        String command = "G()(al)";
        System.out.println(goal.interpret(command));
    }
}
