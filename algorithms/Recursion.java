package algorithms;

public class Recursion {

    public int findFactorial(int n){
      if (n==0)
          return 1;
      return n * findFactorial(n-1);
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        System.out.println(recursion.findFactorial(5));
    }


}
