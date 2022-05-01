package recursion;
//https://practice.geeksforgeeks.org/problems/power-of-numbers-1587115620/1/
public class JosephusProblem {

    public int findSafePosition(int n, int k){
        int skipped = k-1;
        int killed = k+1;
        System.out.println("skip "+skipped);
        return skipped+2;
    }

    public static void main(String[] args) {
        JosephusProblem josephus = new JosephusProblem();
        System.out.println(josephus.findSafePosition(5,3));
    }
}
