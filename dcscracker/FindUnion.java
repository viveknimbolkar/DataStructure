package dcscracker;

public class FindUnion {

    void getUnion(int[] arr1, int[] arr2){
       int i = 0, j = 0;
       int arr1_size = arr1.length;
       int arr2_size = arr2.length;

       while(i < arr1_size && j < arr2_size){
           if (arr1[i] < arr2[j]){
               System.out.print(arr1[i]+" ");
               i++;
           }else if (arr2[j] < arr1[i]) {
               System.out.print(arr2[j]+" ");
               j++;
           }else {
               System.out.print(arr2[j]+" ");
               i++;
               j++;
           }
       }
       while (i < arr1_size){
           System.out.print(arr1[i]+" ");
           i++;
       }

       while (j < arr2_size){
           System.out.print(arr2[j]+" ");
           j++;
       }
    }

    public static void main(String[] args) {
        FindUnion union = new FindUnion();
        int[] data1 = {4,5,6,7,8,9};
        int[] data2 = {1,2,3,4,5,6,7,45,78};
        union.getUnion(data1,data2);
    }
}
