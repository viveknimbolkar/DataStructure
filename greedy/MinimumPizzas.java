package greedy;
//https://www.codechef.com/OCT221D/problems/MINPIZZA
import java.util.Scanner;

public class MinimumPizzas {

    int minPizza(int n, int x){


        int total = n*x; // total max slices

        if(total%4 == 0){
            total = total/4;
        }else{
            total = total / 4+1;
        }
        return total;
    }

    public static void main(String[] args) {
        MinimumPizzas minpiz = new MinimumPizzas();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t!=0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            System.out.println(minpiz.minPizza(n,x));
        }
    }
}
