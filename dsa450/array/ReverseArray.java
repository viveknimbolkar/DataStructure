package dsa450.array;

public class ReverseArray {

    // brute force
    public String reverseArray(String str){
        StringBuilder builder = new StringBuilder();

        for (int i = str.length()-1; i >= 0 ; i--) {
            builder.append(str.charAt(i));
        }

        return builder.toString();
    }

    // two pointer approach
    // we can solve this problem by recursion
    public String reverseArray2(String str){
        char[] charr = str.toCharArray();
        int start = 0, end = str.length()-1;

        while(start < end){
            char temp = charr[start];
            charr[start] = charr[end];
            charr[end] = temp;
            start++;
            end--;
        }
        return new String(charr);
    }


    public static void main(String[] args) {
        ReverseArray revArr = new ReverseArray();
        String str = "GeeksForGeek";

        System.out.println(revArr.reverseArray2(str));
    }
}
