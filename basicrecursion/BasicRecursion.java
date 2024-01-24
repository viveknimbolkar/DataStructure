package basicrecursion;
//https://www.codingninjas.com/studio/problems/factorial-numbers-not-greater-than-n_8365435?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//https://www.codingninjas.com/studio/problems/n-to-1-without-loop_8357243?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//https://www.codingninjas.com/studio/problems/print-1-to-n_628290?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
//https://www.codingninjas.com/studio/problems/sum-of-first-n-numbers_8876068?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
public class BasicRecursion {

    void callPrint1ToN(int i, int n, int[] arr){
        if(i > n) return;
        arr[i-1] = i;
        callPrint1ToN(i+1,n,arr);
    }

    int[] print1ToN(int n){
        int[] result = new int[n];
        callPrint1ToN(1,n,result);
        return result;
    }

//    ======================================================

    void callPrintNto1(int i, int n, int[] arr){
        if(i < 1) return;
        arr[n-i] = i;
        callPrintNto1(i-1,n,arr);
    }

    int[] printNto1(int n){
        int[] result = new int[n];
        callPrintNto1(1,n,result);
        return result;
    }

//    ========================================
   long printSumOfN(int n,int sum){
        if(n == 0) return sum;
        sum += n;
        return printSumOfN(n-1,sum);
    }

//    ======================================================================

    int factorial(int n){
        if(n == 1) return n;
        return n*factorial(n-1) ;
    }


    public static void main(String[] args) {
        BasicRecursion printArrayUptoN = new BasicRecursion();
        int n = 5;
        System.out.println(printArrayUptoN.factorial(n));
//        for (int x: printArrayUptoN.print1toN(n)) {
//            System.out.print(x+" ");
//        }
    }
}
