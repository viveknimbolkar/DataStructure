package basicmath;
//https://www.codingninjas.com/studio/problems/check-armstrong_589?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
public class ArmstrongNumber {

    boolean check(int num){
        int digits = 0, temp = num, sum = 0, temp2 = num;

        while (temp != 0){
            digits++;
            temp /= 10;
        }

        while (temp2 != 0){
            int ld = temp2 % 10;
            sum += Math.pow(ld,digits);
            temp2 /= 10;
        }
        return num == sum;
    }
    public static void main(String[] args) {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
        int num = 371;
        System.out.println(armstrongNumber.check(num));

    }
}
