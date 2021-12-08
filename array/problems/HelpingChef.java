package array.problems;


import java.util.Scanner;

// https://www.codechef.com/problems/FLOW008
public class HelpingChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{


            int testcase = sc.nextInt();

            for (int i = 0; i < testcase ; i++) {

                if (testcase >= 1 && testcase <= 1000){
                    int sample = sc.nextInt();
                    if (sample >= -20 && sample <= 20){
                        if (sample < 10) {
                            System.out.println("Thanks for helping Chef!");
                        }
                        else {
                            System.out.println("-1");
                        }
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
