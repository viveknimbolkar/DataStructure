package array.problems;

public class Insertion {

    void insertAtLast(int[] arr, int position, int capacity, int item){
        if (position >= capacity)
            return;
        arr[position] = item;
    }

    void printArray(int[] arr){
        for (int data: arr) {
            System.out.print(data+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Insertion insertion = new Insertion();
        int capacity = 10;
        int[] arr = new int[capacity];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 67;
        arr[3] = 34;
        arr[4] = 65;
        arr[5] = 89;
        int item = 99;
        int position = 6;

        insertion.printArray(arr);
        insertion.insertAtLast(arr,position,capacity,item);
        insertion.printArray(arr);
    }
}
