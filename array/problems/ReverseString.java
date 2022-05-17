package array.problems;

public class ReverseString {

    void reverseString(char[] s) {
        reverseRecursively(s,0,s.length-1);
    }

    void reverseRecursively(char[] ch,int l, int r){
        if (l <= r){
            char t = ch[l];
            ch[l] = ch[r];
            ch[r] = t;
            reverseRecursively(ch,l+1,r-1);
        }
    }


    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        char[] ch = {'h','e','l','l','o'};
        reverseString.reverseString(ch);

        for (char x: ch) {
            System.out.print(x+" ");
        }
    }
}
