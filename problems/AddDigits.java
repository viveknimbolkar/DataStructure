package problems;

import java.util.ArrayList;

//https://leetcode.com/problems/add-digits/
public class AddDigits {

    int addDigits(int num) {

        while (true){
            ArrayList<Integer> list = getDigits(num);
            int temp = 0;
            for (int i = 0; i < list.size(); i++) {
                temp += list.get(i);
            }
            if (temp < 10) return temp;
            num = temp;
        }
    }

    // extract the digits from the number
    ArrayList<Integer> getDigits(int n){
        ArrayList<Integer> list = new ArrayList<>();
        while (n > 0){
            int remainder = n % 10;
            list.add(remainder);
            n = n/10;
        }
        return list;
    }

    public static void main(String[] args) {
        AddDigits add = new AddDigits();
        int num = 38;

        System.out.println(add.addDigits(num));

    }
}
