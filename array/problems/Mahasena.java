package array.problems;


import java.util.Scanner;

// https://www.codechef.com/problems/AMR15A
public class Mahasena {

    public static void main(String[] args) {
        Mahasena cc = new Mahasena();
        Scanner sc = new Scanner(System.in);
        int numOfSoldiers = sc.nextInt();

        int[] army = new int[numOfSoldiers];

        for (int i = 0; i < army.length; i++) {
            army[i] = sc.nextInt();
        }

        cc.isReady(army);
    }

    void isReady(int[] arr){
        int lucky = 0;
        int unlucky = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                lucky++;
            else
                unlucky++;
        }

        if (lucky > unlucky)
            System.out.println("READY FOR BATTLE");
        else
            System.out.println("NOT READY");
    }
}
