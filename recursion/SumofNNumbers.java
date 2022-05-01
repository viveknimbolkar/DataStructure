package recursion;

public class SumofNNumbers {

    int getSumofNNumbers(int num){
        int sum = 0;
        if (num == 0) return sum;
        return num+getSumofNNumbers(num-1);
    }

    public static void main(String[] args) {
        SumofNNumbers sum = new SumofNNumbers();
        int number = 10;
        System.out.println(sum.getSumofNNumbers(number));
    }
}
