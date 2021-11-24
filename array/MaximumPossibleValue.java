package array;
// TOTO: Getting wrong output
public class MaximumPossibleValue {

    long maxPossibleValue(int N, int A[] ,int B[]) {
        long x, y, ans=0, total=0, min = (long) 1e10;

        for(int i = 0; i< N; i++){
            x = A[i];
            y = B[i];

            if(y%2==1)
                y--;
            if(y>=2)
                min = Math.min(min,x);

            ans = ans + y*x;
            total = total + y;
        }

        if(total%4 != 0){
            ans = ans - 2*min;
        }
        return ans;
    }

    public static void main(String[] args) {
        MaximumPossibleValue maxValue = new MaximumPossibleValue();
        int[] A = {3,4,6,5};
        int[] B = {2,3,1,6};
        System.out.println(maxValue.maxPossibleValue(A.length,A,B));
    }
}
