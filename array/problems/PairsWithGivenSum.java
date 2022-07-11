package array.problems;
// https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1/
public class PairsWithGivenSum {

    class pair  {
        long first, second;
        public pair(long first, long second)
        {
            this.first = first;
            this.second = second;
        }
    }

    pair[] allPairs( long A[], long B[], long N, long M, long X) {
        pair[] ans = new pair[A.length+B.length];
        int k = 0;
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B.length; j++){
                if(A[i]+B[j] == X){
                    ans[k++] = new pair(A[i],B[j]);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        PairsWithGivenSum pair = new PairsWithGivenSum();
        long A[] = {-1, -2, 4, -6, 5, 7};
        long B[] = {6, 3, 4, 0};

        for (pair p: pair.allPairs(A,B,A.length,B.length,8)) {
            System.out.println(p.first+" "+p.second);
        }
    }
}
