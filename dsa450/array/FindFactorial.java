package dsa450.array;

import java.util.ArrayList;
import java.util.Collections;

public class FindFactorial {

    ArrayList<Integer> find(int n){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        for(int fact = 2; fact <= n; fact++){
            int size = list.size(), carry = 0;
            for(int i = 0; i < size; i++){
                int temp = list.get(i)*fact+carry;
                list.set(i,temp%10);
                carry = temp/10;
            }
            while(carry != 0){
                list.add(carry%10);
                carry /= 10;
            }
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        FindFactorial findfactorial = new FindFactorial();
        int n = 5;

        System.out.println(findfactorial.find(n));
    }
}
