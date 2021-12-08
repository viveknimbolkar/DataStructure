package array.problems;
// https://practice.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1/
public class FindTripletsWithZeroSum {

    boolean findTriplate(int[] arr){
        boolean found = false;
        //get first element in i (subarray having 3 elements first element)
        for (int i = 0; i < arr.length-2; i++) {
            //get second element in an subarray
            for (int j = i+1; j < arr.length-1; j++) {
                //get third element in subarray
                for (int k = 0; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k] == 0){
                        found = true;
                        System.out.println(1);
                    }
                }

            }
        }
        if (found == false)
            System.out.println(0);
        return found;
    }


    public static void main(String[] args) {
        FindTripletsWithZeroSum findTriplate = new FindTripletsWithZeroSum();
        int[] arr = {0, -1, 2, -3, 1};
        System.out.println(findTriplate.findTriplate(arr));
    }
}
