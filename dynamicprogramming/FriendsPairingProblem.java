package dynamicprogramming;
//https://practice.geeksforgeeks.org/problems/friends-pairing-problem5425/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Dynamic%20Programming&sortBy=submissions
public class FriendsPairingProblem {
// TODO: ALL TEST CASES ARE NOT PASSING
    long countFriendsPairings(int n){
        long[] dp = new long[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <=n ; i++) {
            dp[i] = dp[i-1]+dp[i-2]*(i-1);
        }

        return dp[n];
    }

    public static void main(String[] args) {
        FriendsPairingProblem friendsPairingProblem = new FriendsPairingProblem();
        int friends = 6569;
        System.out.println("Pairing possibilities: "+friendsPairingProblem.countFriendsPairings(friends));
    }
}
