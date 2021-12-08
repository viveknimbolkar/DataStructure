package array.string;

import predefined.PredefinedMethods;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/naive-algorithm-for-pattern-searching/
public class NaiveAlgo {

    ArrayList<Integer> findPattern(String str, String patt){
        ArrayList<Integer> foundAt = new ArrayList<>();

        int strLen = str.length();
        int pattLen = patt.length();

        for (int i = 0; i < strLen-pattLen; i++) {
            //search for pattern in a given window
            int j;
            for (j = 0; j < pattLen; j++)
                if (str.charAt(i+j) != patt.charAt(j))
                    break;

            //if j ends to the end of pattern length
            if (j == pattLen)
                foundAt.add(i);
        }
        return foundAt;

    }

    public static void main(String[] args) {
        NaiveAlgo naive = new NaiveAlgo();
        PredefinedMethods methods = new PredefinedMethods();
        String text = "AABAACAADAABAAABAA";
        String pattern = "AABA";

        System.out.println(naive.findPattern(text,pattern));

    }
}
