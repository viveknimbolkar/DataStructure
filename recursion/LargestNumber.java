package recursion;
public class LargestNumber {

    int getMaxNum(int[] arr, int i){
        if (i >= arr.length-1) return arr[i];
        return Math.max(arr[i],getMaxNum(arr,i+1));
    }

    public static void main(String[] args) {
        LargestNumber large = new LargestNumber();
        int[] arr = {23,45,678,2,45,7};
        System.out.println("Largest no: "+large.getMaxNum(arr,0));
    }
}
