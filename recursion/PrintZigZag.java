package recursion;

import java.util.ArrayList;

public class PrintZigZag {

    ArrayList<Integer> pre = new ArrayList<>();
    ArrayList<Integer> in = new ArrayList<>();
    ArrayList<Integer> post = new ArrayList<>();
    void printZigZag(int n){
        if (n == 0)return;

        System.out.println("Pre: "+n);
        pre.add(n);
        printZigZag(n-1);
        System.out.println("In: "+n);
        in.add(n);
        printZigZag(n-1);
        System.out.println("Post: "+n);
        post.add(n);
    }

    public static void main(String[] args) {
        PrintZigZag print = new PrintZigZag();
        int n = 3;
       print.printZigZag(n);
        System.out.println(print.pre);
        System.out.println(print.in);
        System.out.println(print.post);
    }
}
