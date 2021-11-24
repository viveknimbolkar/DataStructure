package array;

public class Replace0With5 {

    int replace0s(int N){
        String ch = String.valueOf(N);
        char[] chArr = ch.toCharArray();
        for (int i = 0; i < ch.length(); i++) {
            if (chArr[i]=='0'){
                chArr[i] = '5';
            }
        }
        return Integer.parseInt(String.valueOf(chArr));
    }

    public static void main(String[] args) {
        Replace0With5 replace = new Replace0With5();
        int N = 1004;
        System.out.println(replace.replace0s(N));
    }
}
