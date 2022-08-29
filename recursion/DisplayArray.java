package recursion;

public class DisplayArray {

    void displayArray(int[] arr, int index){
        if (index >= arr.length) return;
        System.out.println(arr[index]);
        displayArray(arr,index+1);
    }

    public static void main(String[] args) {
        DisplayArray dis = new DisplayArray();
        int[] arr = {1,2,3,4,5,6,7,8};
        dis.displayArray(arr,0);
    }
}
