package array.string;

import java.util.ArrayList;

public class ShortDistance {
    int[] shortestToChar(String s, char c) {
        int[] answ = new int[s.length()];
        int n = s.length(), index = -n;

        // forward traverse
        for (int i = 0; i < n; i++) {
            //change the value of index to e
            if (s.charAt(i) == c){
                index=i;
            }
            answ[i] = i - index;
        }

        //reverse traverse
        for (int i = n-1; i >=0 ; i--) {
            //change the value of index to e
            if (s.charAt(i) == c){
                index = i;
            }
            answ[i] = Math.min(answ[i],Math.abs(i-index));
        }
        return answ;
    }

    public static void main(String[] args) {
        ShortDistance sd = new ShortDistance();
        String s = "loveleetcode";
        char c = 'e';

        for (int x : sd.shortestToChar(s,c))
            System.out.print(x+" ");


    }

}
