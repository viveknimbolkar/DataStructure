package array.problems;

import java.util.Scanner;

// https://www.codechef.com/problems/FLOW007
public class ReverseTheNumber {
    public static void main(String[] args)  throws Exception{
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int[] array = new int[testCases];
        int[] temp = new int[testCases];

        for (int i = 0; i < testCases; i++) {
            array[i] = sc.nextInt();
            int rev = 0;
            int j = array[i];

            while (j > 0){
                rev = rev * 10;
                rev = rev + j%10;
                j = j/10;
            }
            temp[i] = rev;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(temp[i]);
        }
    }
}
