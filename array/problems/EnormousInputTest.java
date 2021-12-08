package array.problems;

//https://www.codechef.com/problems/INTEST
import java.util.Scanner;

class EnormousInputTest {

    public static void main(String[] args) {
        EnormousInputTest cc = new EnormousInputTest();
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int divideBy = sc.nextInt();

        int[] userInputs = new int[testcase];
        int count = 0;

        for (int i = 0; i < testcase; i++) {
            userInputs[i] = sc.nextInt();
        }

        System.out.println(cc.showMeResult(userInputs, divideBy));


    }

    int showMeResult(int arr[], int remainder){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % remainder == 0){
                count++;
            }
        }
        return count;
    }

}