package backtracking;
//https://practice.geeksforgeeks.org/problems/finding-position2223/1
public class FindingPosition {

    long nthPosition(long n){
        if(n == 1) return 1;

        int ans = (int) nthPosition(n/2);
        return 2*ans;
    }

    public static void main(String[] args) {
        FindingPosition findpos = new FindingPosition();
        System.out.println(findpos.nthPosition(5));
    }
}
