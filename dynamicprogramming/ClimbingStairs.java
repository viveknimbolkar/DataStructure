package dynamicprogramming;
//https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {

    public int climbStairs(int n) {
        if(n ==0)return 0 ;
        if(n ==1)return 1 ;
        if(n ==2)return 2;        int allways =0;
        int beforeonestep =2;
        int beforetwostep =1;
        for (int i =2;i <n;i++){
            allways=beforeonestep+beforetwostep;
            beforetwostep = beforeonestep;
            beforeonestep = allways;
        }
        return allways;
    }

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int n = 3;
        System.out.println(climbingStairs.climbStairs(n));
    }

}
