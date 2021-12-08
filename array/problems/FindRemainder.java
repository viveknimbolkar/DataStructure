package com.solve;

import java.util.Scanner;

// https://www.codechef.com/problems/FLOW002
public class FindRemainder {
    public static void main(String[] args){
        FindRemainder m = new FindRemainder();
        int a,b,c,n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for(int i =0; i<n;i++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = a%b;
            System.out.println(c);
        }
    }
}
