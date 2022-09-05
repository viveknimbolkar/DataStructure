package array.string;
//https://leetcode.com/problems/rotate-string/
public class RotateString {

    boolean rotateString(String s, String goal) {
        for (int i = 0; i < goal.length(); i++) {
            // convert string into array
            char[] charr = goal.toCharArray();
            // rotate array by one
            rotateArray(charr);
            goal = new String(charr);
            String rotatedString = new String(charr);
            System.out.println("rotate: "+rotatedString);
            if (rotatedString.equals(s)) return true;
        }
        return false;
    }

    // rotate array by one
    void rotateArray(char[] arr){
        char ch = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = ch;
    }


    public static void main(String[] args) {
        RotateString rotate = new RotateString();
        String s = "abcde", goal = "cdeab";
        System.out.println("Can form :"+rotate.rotateString(s,goal));
    }
}
