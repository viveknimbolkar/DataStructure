package array;
// find permutations of string
public class PermutationOfString {

    void findPermutation(String str, int left, int right){
           if (left == right){
               System.out.println(str);
           }else {
               for (int i = left; i <= right; i++) {

                   //do
                   str = swap(str,left,i);
                   //recur
                   findPermutation(str,left+1,right);
                   //undo
                   str = swap(str,left,i);
               }
           }
    }

    String swap(String str, int left, int right){
        char[] chArr = str.toCharArray();
        char ch = chArr[left];
        chArr[left] = chArr[right];
        chArr[right] = ch;
        return String.valueOf(chArr); // converting char arrya to string
    }

    public static void main(String[] args) {
        PermutationOfString p = new PermutationOfString();
        String str = "abc";
        p.findPermutation(str,0,str.length()-1);
    }
}
