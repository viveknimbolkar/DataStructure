package greedy;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class NumberOfStepsToReduceNumberToZero {
    int numberOfSteps(int num) {
        int steps = 0;

        while (num != 0){
            if (num%2 == 0) num /= 2;
            else num -= 1;
            steps++;
        }

        return steps;
    }

    public static void main(String[] args) {
        NumberOfStepsToReduceNumberToZero num = new NumberOfStepsToReduceNumberToZero();
        int n = 123;
        System.out.println(num.numberOfSteps(n));
    }
}
