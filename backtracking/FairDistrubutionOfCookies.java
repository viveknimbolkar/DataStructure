package backtracking;
//https://leetcode.com/problems/fair-distribution-of-cookies/
public class FairDistrubutionOfCookies {
    int result = Integer.MAX_VALUE;
    int distributeCookies(int[] cookies, int k) {
        dfs(cookies,0,k, new int[k]);
        return result;
    }

    void dfs(int[] cookies, int curr, int k, int[] children) {
        // for the last element i.e. base case
        if (cookies.length == curr){
            int max = 0;
            // get the max from children
            for (int c: children) {
                max = Math.max(c,max);
            }
            result = Math.min(max,result);
            return;
        }

        // allot cookies to the children
        for (int i = 0; i < k; i++) {
            children[i] += cookies[curr];
            dfs(cookies,curr+1,k,children); // recursively allote cookies
            children[i] -= cookies[curr]; // backtrack to try another combinations
        }
    }

    public static void main(String[] args) {
        FairDistrubutionOfCookies fair = new FairDistrubutionOfCookies();
        int[] cookies = {8,15,10,20,8};
        int k = 2;

        System.out.println(fair.distributeCookies(cookies,k));
    }
}
