package stack;
import java.util.Stack;
// https://practice.geeksforgeeks.org/problems/easy-string2212/1/
public class CompressString {

    //convert character to lowercase
    char toLower(char ch){
        if(ch >= 'A' && ch <= 'Z')
            return (char)(ch+32);
        return ch;
    }

    String transform(String exp){
        int c = 0;
        StringBuilder compressedString = new StringBuilder();
        for (int i = 0; i < exp.length(); i++) {
            c++;
            if (i+1 < exp.length() && toLower(exp.charAt(i)) == toLower(exp.charAt(i+1)))
                continue;
            compressedString.append(Integer.toString(c));
            compressedString.append(exp.charAt(i));
            c = 0;
        }
        return compressedString.toString();
    }

    public static void main(String[] args) {
        CompressString compress = new CompressString();
        String str = "aaAbBb";
        System.out.println(compress.transform(str));
    }
}
