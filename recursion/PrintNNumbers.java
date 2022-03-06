package recursion;
// https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1/
public class PrintNNumbers {
    void printNNumbers(int n){
        if (n == 0) return;
        printNNumbers(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        PrintNNumbers num = new PrintNNumbers();
        num.printNNumbers(10);
    }
}
