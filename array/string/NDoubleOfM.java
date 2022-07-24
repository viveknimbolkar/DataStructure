package array.string;
//https://leetcode.com/problems/check-if-n-and-its-double-exist/
public class NDoubleOfM {

    boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(i == j) continue;
                if (arr[i] == 2*arr[j]) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        NDoubleOfM find = new NDoubleOfM();
        int[] arr = {10,2,5,3};
        System.out.println("Double of n or m Exists: "+find.checkIfExist(arr));
    }
}


