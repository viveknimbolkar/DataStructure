import java.util.Arrays;
import java.util.Scanner;

class MyClass{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t!=0){
            int n = sc.nextInt();
            String soldiers = sc.next();
            char[] soldiersArr = soldiers.toCharArray();

            for (int i = 0; i < n; i++) {
                soldiersArr[i] = soldiers.charAt(i);
            }

            Arrays.sort(soldiersArr);
            int zero = 0, one = 0;

            for (int i = 0; i < soldiersArr.length; i++) {
                if (soldiersArr[i] == '0') zero++;
                else one++;
            }

            if (zero%2 == 0) System.out.println("0");
            else if(one%2 == 0) System.out.println("1");
            t--;
        }

    }
}