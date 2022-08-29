package recursion;

public class PowerofX {

    int findPower(int x, int n){
        if (n == 0) return 1;
        return x*findPower(x,n-1);
    }

    public static void main(String[] args) {
        PowerofX pow = new PowerofX();
        int x = 4;
        int n = 3;
        System.out.println(pow.findPower(x,n));
    }
}
