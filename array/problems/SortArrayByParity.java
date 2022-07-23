package array.problems;

import java.util.ArrayList;

//https://leetcode.com/problems/sort-array-by-parity/
public class SortArrayByParity {

    int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if (nums[i]%2 == 0){
                even.add(nums[i]);
            }else {
                odd.add(nums[i]);
            }
        }

        int k = 0;
        for (int i = 0; i < even.size(); i++) {
            res[k++] = even.get(i);
        }

        for (int i = 0; i < odd.size(); i++) {
            res[k] = odd.get(i);
            k++;
        }

        return res;
    }

    void reverse(int[] a,int l, int r){
       while (l <= r){
           int temp = a[l];
           a[l] = a[r];
           a[r] = temp;
           l++;
           r--;
       }
    }

    public static void main(String[] args) {
        SortArrayByParity sort = new SortArrayByParity();
        int[]  nums = {3,1,2,4};

        for (int x: sort.sortArrayByParity(nums)) {
            System.out.print(x+" ");
        }
    }
}
