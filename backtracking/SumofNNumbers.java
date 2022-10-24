package backtracking;

public class SumofNNumbers {

    // functional recursion
    int getSumofNNumbers(int num){
        if (num == 0) return 0;
        return num+getSumofNNumbers(num-1);
    }

    //paramaterized recursion
    int getSumofNNumbers(int i, int sum){
        if (i < 1){
            return sum;
        }
        return getSumofNNumbers(i-1,sum+i);
    }

    public static void main(String[] args) {
        SumofNNumbers sum = new SumofNNumbers();
        int number = 4;
        System.out.println(sum.getSumofNNumbers(number));
    }
}
