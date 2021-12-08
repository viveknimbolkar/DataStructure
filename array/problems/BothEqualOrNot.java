package array.problems;
// https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1/
import java.util.Arrays;

public class BothEqualOrNot {
    
    boolean findEqualOrNot(int[] a, int[] b, int n){
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < n; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        BothEqualOrNot isequal = new BothEqualOrNot();
        int[] a = {1,2,5,4,0};
        int[] b = {2,4,5,0,1};

        System.out.println(isequal.findEqualOrNot(a,b,a.length));
    }
}
