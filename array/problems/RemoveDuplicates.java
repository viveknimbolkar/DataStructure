package array.problems;

// This method is only applicable for sorted array

class RemoveDuplicates {

    int getArr(int[] arr,int size){
        int[] tempArr = new int[size];

        int j = 0;

        for (int i = 0; i < size -1; i++) {
            if (arr[i] != arr[i+1]){
                tempArr[j] = arr[i];
                j++;
            }
        }

        tempArr[j++] = arr[size - 1];

        for (int i = 0; i < j; i++) {
            arr[i] = tempArr[i];
        }

        return j;
    }

    public static void main(String[] args) {
        RemoveDuplicates t = new RemoveDuplicates();
        int[] arr = {1,2,2,2,3,8,9,12,12,45};
        int size = arr.length;

        int temp = t.getArr(arr,size);

        for (int i = 0; i < temp ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}