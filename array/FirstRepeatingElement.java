package array;
// https://practice.geeksforgeeks.org/problems/first-repeating-element4018/1
public class FirstRepeatingElement {

    int find(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];
            //find repeating element
            for (int j = 0; j < arr.length; j++) {
                if (currentElement == arr[j])
                    return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstRepeatingElement firstRepeatingElement = new FirstRepeatingElement();
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeatingElement.find(arr));
    }
}
