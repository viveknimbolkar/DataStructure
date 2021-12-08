package array.problems;

import java.util.Scanner;

// https://www.codechef.com/problems/DIFFSUM
public class SumOrDifference {

    public static void main(String[] args) {
        SumOrDifference sumOrDifference = new SumOrDifference();
        Scanner sc = new Scanner(System.in);
        while(true){
            int firstNum = sc.nextInt();
            int secondNum = sc.nextInt();

            if ((firstNum >= 1000 && firstNum <= -1000) && (secondNum >= 1000 && secondNum <= -1000)){
                if (firstNum > secondNum){
                    System.out.println(firstNum-secondNum);
                }else if (firstNum < secondNum){
                    System.out.println(firstNum+secondNum);
                }
            }
        }
    }
}
