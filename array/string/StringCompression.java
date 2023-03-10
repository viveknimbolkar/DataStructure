package array.string;
//https://leetcode.com/problems/string-compression/
public class StringCompression {

    int compress(char[] chars) {
        int indexAns = 0, index = 0;
        while(index < chars.length){
            int count = 0;
            char currentChar = chars[index];
            while (index < chars.length && currentChar == chars[index]){
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if (count != 1){
                for (char c:Integer.toString(count).toCharArray()) {
                    chars[indexAns++] = c;
                }
            }
        }
        return indexAns;
    }

    public static void main(String[] args) {
        StringCompression string = new StringCompression();
        char[]  chars = {'a','a','b','b','c','c','c'};
        System.out.println(string.compress(chars));
    }
}
