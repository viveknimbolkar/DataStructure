package greedy;
//https://practice.geeksforgeeks.org/problems/find-optimum-operation4504/1
public class MinimumOperations {

    int minOperation(int n) {
        int ans = 0;
        // start from right to left and reduce the n by -1 or dividing by 2
        while (n > 0){
            // if odd number encounder then ++ans and --n
            if (n%2 != 0){
                ans++;
                n--;
            }
            if (n == 0) break;

            n /= 2; //reduce the number by reverse multiplication by 2
            ans++;
        }

        return ans;
    }

    public static void main(String[] args) {
        MinimumOperations min = new MinimumOperations();
        int n = 5;
        System.out.println(min.minOperation(n));
    }
}
