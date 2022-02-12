package stack;
// https://practice.geeksforgeeks.org/problems/get-min-at-pop/1/
//TODO: incomplete
import java.util.Arrays;
import java.util.Stack;

public class GetMinAtPop {

    Stack<Integer> push(int[] arr,int n){
        Stack<Integer> s = new Stack<>();
        Arrays.sort(arr);
        for (int i = arr.length-1; i >= 0; i--) {
            s.push(arr[i]);
            System.out.println(arr[i]);
        }
         return s;
    }

    void getMinAtPop(Stack<Integer> s) {
        int result = s.peek();
        while (!s.isEmpty()){
            System.out.println(result);
            s.pop();
        }
    }

    public static void main(String[] args) {
        GetMinAtPop min = new GetMinAtPop();
        int[] a = {1,2,3,4,5,6};
        min.getMinAtPop(min.push(a,a.length));

    }
}
