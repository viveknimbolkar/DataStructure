package backtracking;

public class SumofNNaturalNum {

    void printSum(int i, int n, int sum) {
        if (i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);
//        System.out.println(i);
    }

    public static void main(String[] args) {
        SumofNNaturalNum sum = new SumofNNaturalNum();
        int n = 5;
        sum.printSum(0,n,0);
    }
}
