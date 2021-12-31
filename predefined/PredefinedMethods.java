package predefined;

import linkedlist.singly.LinkedList;

public class PredefinedMethods {

    public String strReverse(String str){
        char[] chArr = str.toCharArray();
        String result = "";
        for (int i = str.length(); i > 0 ; i--) {
            result += str.charAt(i);
        }

        return result;
    }
    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void printArray(int[] arr){
        for (int a:arr)
            System.out.print(a+" ");
        System.out.println();
    }

    public void print2DArray(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
        }
        System.out.println();
    }

    public int getGcd(int a, int b){
        if (b == 0) return a;
        return getGcd(a,a%b);
    }
}
