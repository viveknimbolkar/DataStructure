package array.problems;

//https://www.codechef.com/problems/FLOW014
import java.util.Scanner;

class GradeSteal {

    final int HARDNESS = 50;
    final float CARBON_CONTENT = 0.7f;
    final int TENSIL_STRENGTH = 5600;

    public static void main(String[] args) {

        GradeSteal GradeSteal = new GradeSteal();
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for (int i = 0; i < testcase; i++) {
            int hardness = sc.nextInt();
            float carbonContent = sc.nextFloat();
            int tensilStrength = sc.nextInt();

            if (hardness > GradeSteal.HARDNESS && carbonContent < GradeSteal.CARBON_CONTENT && tensilStrength > GradeSteal.TENSIL_STRENGTH){
                System.out.println(10);
            }else if (hardness > GradeSteal.HARDNESS && carbonContent < GradeSteal.CARBON_CONTENT){
                System.out.println(9);
            }else if (carbonContent < GradeSteal.CARBON_CONTENT && tensilStrength > GradeSteal.TENSIL_STRENGTH){
                System.out.println(8);
            }else if (hardness > GradeSteal.HARDNESS && tensilStrength > GradeSteal.TENSIL_STRENGTH){
                System.out.println(7);
            }else if (hardness > GradeSteal.HARDNESS || carbonContent < GradeSteal.CARBON_CONTENT || tensilStrength > GradeSteal.TENSIL_STRENGTH) {
                System.out.println(6);
            }else {
                System.out.println(5);
            }



        }

    }

}