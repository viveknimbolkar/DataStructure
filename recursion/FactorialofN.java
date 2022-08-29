package recursion;

public class FactorialofN {

    int findFactorial(int n){
        if (n == 1) return 1;
        return n * findFactorial(n-1);
    }

    int findFactorial(int a, boolean dummy){
        int fun1 = findFactorial(a-1);
        int fn = fun1;
        return fn*fun1;
    }

    public static void main(String[] args) {
        FactorialofN fact = new FactorialofN();
        int n = 4;
        System.out.println("Factorial of N: "+fact.findFactorial(n, false));
    }
}
