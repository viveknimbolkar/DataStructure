package array.problems;
//https://leetcode.com/problems/get-maximum-in-generated-array/
public class GetMaximumInGeneratedArray {
    int getMaximumGenerated(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int ans = 1;
        int[] array = new int[n+1];

        array[0] = 0;
        array[1] = 1;
        for (int i = 1; (2*i)+1 <= n ; i++) {
            array[2*i] = array[i];
            array[2*i+1] = array[i]+array[i+1];
            ans = Math.max(ans,array[2*i+1]);
        }
        return ans;
    }

    public static void main(String[] args) {
        GetMaximumInGeneratedArray getm = new GetMaximumInGeneratedArray();
        int n = 7;
        System.out.println("max: "+getm.getMaximumGenerated(n));
    }
}
