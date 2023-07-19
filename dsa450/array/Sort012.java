package dsa450.array;

public class Sort012 {

    private void sort012(int[] arr){
        int temp =0, low = 0, mid= 0, high = arr.length-1;

        while (mid <= high) {
            if (arr[mid] == 0){
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }else if(arr[mid] == 2){
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }else {
                mid++;
            }
        }
    }

    public static void main(String[] args) {
        Sort012 sort = new Sort012();
        int[] arr = {0,2,0,1,1,2,1,0,1,2,1,0};
        sort.sort012(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
