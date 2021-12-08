package array.problems;

// https://practice.geeksforgeeks.org/problems/perfect-arrays4645/1/
public class PerfectArrays {

    boolean isPerfect(int[] arr){
        int[] reversedArr = reverse(arr,arr.length,arr.length);
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != reversedArr[j]){
                return true;
//                break;
            }
            j++;
        }
        return true;
    }

    int[] reverse(int[] a, int n, int size){
//        n = n % size;
//        int i,j,k,temp=0;
//        int gcd = gcd(n,size);
//        for (int i = 0; i < gcd; i++) {
//            temp = a[i];
//            j = i;
//            while (true){
//                k = j + n;
//                if (k >= size)
//                    k = k-size;
//                if (i==k)
//                    break;
//                a[j] = a[k];
//                j=k;
//            }
//            a[j] = temp;
//        }
//        return a;
        return a;
    }

    int gcd(int a, int b){
        if (b==0) return a;
        else return gcd(b,a%b);
    }

    public static void main(String[] args) {
        PerfectArrays perfectArrays = new PerfectArrays();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(perfectArrays.isPerfect(arr));

    }
}
