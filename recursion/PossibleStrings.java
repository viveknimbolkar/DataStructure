package recursion;

import java.util.ArrayList;
// https://practice.geeksforgeeks.org/problems/print-all-possible-strings/1/
public class PossibleStrings {

    ArrayList<String> spaceString(String str, int l, int r){
        ArrayList<String> result = new ArrayList<>();
        char[] charArr = str.toCharArray();
        if (l==r){
            result.add(str);
            return result;
        }

        for (int i = 0; i <=l ; i++) {
            str = swap(str,l,r,i);
            spaceString(str,l,r+str.charAt(i));
            str = swap(str,l,r,i);
        }

        return result;
    }

    String swap(String str, int i, int j, int current){
        char ichar = str.charAt(i);
        char jchar = str.charAt(j);

        str.replace(ichar,jchar);
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        PossibleStrings possibleStrings = new PossibleStrings();
        String str = "abc";
        System.out.println(possibleStrings.spaceString(str, 0, str.length()-1));
    }
}