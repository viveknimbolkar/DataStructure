package dynamicprogramming;
//https://practice.geeksforgeeks.org/problems/count-numbers-containing-43022/1
public class CountNumbersContainingFour {

    int countNumberswith4(int N) {
        int totalFours = 0;

        for (int i = 1; i < N; i++) {
           String arr = String.valueOf(i);
           String[] str = arr.split("");
            for (int j = 0; j < str.length; j++) {
                System.out.println(str[j]);
                if (str[j] == "4"){
                    totalFours++;
                    break;
                }
            }
        }

        return totalFours;
    }

    public static void main(String[] args) {
        CountNumbersContainingFour count = new CountNumbersContainingFour();
        int n = 9;
        System.out.println("total no. of fours: "+count.countNumberswith4(n));
    }
}
