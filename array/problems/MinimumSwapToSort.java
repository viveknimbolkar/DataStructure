package array.problems;

public class MinimumSwapToSort {

//    int findSwap(int[] nums){
//        int n= nums.length(),small,pos,j,temp;
//        int temparr[n];
//        int i;
//        for(i=0;i<n;i++){
//            temparr[i]=nums[i];
//        }
//        Arrays.sort(temparr, temparr+n);
//        for(i=0;i<n;i++){
//            nums[i]=lower_bound(temparr,temparr+n,nums[i])-temparr;
//        }
//        int count=0;
//        for(int t=0;t<n;t++){
//            while(t!=nums[t]){
//                temp=nums[nums[t]];
//                nums[nums[t]]=nums[t];
//                nums[t]=temp;
//                count++;
//            }}
//
//        return count;
//    }

    public static void main(String[] args) {
        MinimumSwapToSort minimum = new MinimumSwapToSort();
        int[] arr = {2,8,5,4};
        int[] arr2 = {10,19,6,3,5};
        int[] arr3 = {7,16,14,17,6,9,5,3,18};
//        System.out.println(minimum.findSwap(arr));
    }
}
