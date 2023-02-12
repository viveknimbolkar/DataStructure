package array.problems;

import java.util.ArrayList;

class SeperateNumbers{

    public static void main(String[] args) {
        int[] data =  {13,25,83,77};

        for (int a: separateDigits(data)) {
            System.out.println(a);
        }


    }

    public static int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<10){
                ans.add(nums[i]);
            }else{
                int[] digits = getDigits(nums[i]);
                for (int x: digits) {
                    ans.add(x);
                }
            }
        }

        int[] finalans = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            finalans[i] = ans.get(i);
        }
        return finalans;
    }

    public static int[] getDigits(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        while (n > 0){
            int rem = n%10;
            ans.add(rem);
            n = n/10;
        }
        int[] temp = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            temp[i] = ans.get(i);
        }
        reverseRecursively(temp,0,temp.length);
        return temp;
    }

    static void reverseRecursively(int[] arr, int left, int right){
        if (left >= right/2) return;
        swap(arr,left,right-left-1);
        reverseRecursively(arr,left+1,right);
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}