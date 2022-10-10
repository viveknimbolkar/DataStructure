package problems;
//https://leetcode.com/problems/count-of-matches-in-tournament/
public class CountOfMatchesInTournament {

    int numberOfMatches(int n) {
        int ans = 0, teams = n, matches = 0, advance = 0;

        while (n > 1){
            if (n%2==0){
                matches = n/2;
                advance = n/2;
            }else {
                matches = (n-1)/2;
                advance = (n-1)/2 + 1;
            }
            ans++;
            System.out.println("ans: "+ans+" teams: "+teams+" matches:"+matches+" advance:"+advance);

            n--;
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        CountOfMatchesInTournament ocut = new CountOfMatchesInTournament();
        int n = 14;
        System.out.println(ocut.numberOfMatches(n));
    }
}
