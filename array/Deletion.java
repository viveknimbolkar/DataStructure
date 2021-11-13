package array;

public class Deletion {

    int getItem(int[] arr,int left, int right, int item){
        if (right < left)
            return -1;
        // get the middle element
        int middleElement = (left + right) / 2;
        //if middle element matched to item
        if (arr[middleElement] == item)
            return middleElement;
        //search in right side
        if (item > arr[middleElement])
            return getItem(arr,middleElement+1,right,item);
        //search in left side
        return getItem(arr,left,middleElement-1,item);
    }

    int deleteItem(int[] arr,int arrSize, int item){
        int position = getItem(arr,0,arrSize-1,item);
        //base case to terminate process if element not found
        if (position == -1) return -1;
        // shift all element starting from delete element to left by 1
        for (int i = position; i < arrSize -1; i++)
            arr[i] = arr[i+1];
        return arrSize-1;
    }

    void deleteUnsortedArray(int[] arr,int position){
        if (position > arr.length)
            return;
        for (int i = position; i < arr.length-1; i++)
            arr[i] = arr[i+1];
    }

    void printArray(int[] arr){
        for (int data:arr)
            System.out.print(data+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        Deletion deletion = new Deletion();
        int[] arr = {10,20,30,40,50,60,70,80,90};


        deletion.printArray(arr);
        System.out.println(deletion.deleteItem(arr,arr.length,30));
        deletion.printArray(arr);

    }

}
