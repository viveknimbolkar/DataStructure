package com.solve;

import java.util.Scanner;

// https://www.codechef.com/problems/HEADBOB
public class HeadAndBob {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HeadAndBob headAndBob = new HeadAndBob();
        int testcase = sc.nextInt();

        for (int i = 0; i < testcase; i++) {
            int person = sc.nextInt();
            String data = sc.next();
            boolean certain = false;
            char[] temp = data.toCharArray();
            //traverse upto number of person
            for (int j = 0; j < person; j++) {
                if (temp[j] == 'N'){
                    continue;
                }else {
                    certain = true;
                    if (temp[j] == 'I'){
                        System.out.println("INDIAN");
                        break;
                    }else if (temp[j] == 'Y'){
                        System.out.println("NOT INDIAN");
                        break;
                    }
                }
            }
            if (!certain){
                System.out.println("NOT SURE");
            }

        }
    }


}
