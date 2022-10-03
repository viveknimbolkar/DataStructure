package array.problems;
//https://leetcode.com/problems/defuse-the-bomb/
public class DefuseTheBomb {

    int[] decrypt(int[] code, int k) {
        int[] ans = new int[code.length];

        if (k == 0){
            for (int i = 0; i < code.length; i++)
                code[i] = 0;
            return code;
        }else if (k < 0){

        }else if (k > 0){
            int totalSum = 0;
            //get the total sum of an array
            for (int i: code)
                totalSum += i;

            for (int i = 0; i < code.length; i++)
                code[i] = totalSum - code[i];

            return code;
        }
        return ans;
    }

    public static void main(String[] args) {
        DefuseTheBomb defuse = new DefuseTheBomb();
        int[] code = {5,7,1,4};
        int  k = 3;

        for (int x: defuse.decrypt(code,k)) {
            System.out.print(x+" ");
        }
    }
}
