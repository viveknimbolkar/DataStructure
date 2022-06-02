package array.string;
// https://leetcode.com/problems/replace-all-digits-with-characters/
public class ReplaceAllDigit {

    String replaceDigits(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))){
                ans.append(shift(s.charAt(i-1),Integer.parseInt(String.valueOf(s.charAt(i)))));
//                System.out.println(s.charAt(i-1)+" "+s.charAt(i));
            }else {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }

    // return xth character from c
    char shift(char c, int x){
        return (char) ((int)c+x);
    }

    public static void main(String[] args) {
        ReplaceAllDigit replace = new ReplaceAllDigit();
        String str = "a1c1e1";
        System.out.println(replace.replaceDigits(str));
    }
}
