package basicmath;

import java.util.ArrayList;
import java.util.List;

public class FindAllDivisors {

    List<Integer> find(int n){
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            if(n %i == 0) divisors.add(i);
        }
return divisors;
    }
    public static void main(String[] args) {
        FindAllDivisors findAllDivisors = new FindAllDivisors();
        int n = 5;
        for (int divisor: findAllDivisors.find(n)) {
            System.out.println(divisor);
        }
    }
}
