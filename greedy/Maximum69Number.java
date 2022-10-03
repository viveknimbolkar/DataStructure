package greedy;
//https://leetcode.com/problems/maximum-69-number/
public class Maximum69Number {
    int maximum69Number (int num) {
       StringBuilder sb = new StringBuilder();
        sb.append(num);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '9'){
                sb.setCharAt(i,'9');
                Integer.parseInt(sb.toString());
            }
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        Maximum69Number maxi = new Maximum69Number();
        int num = 9669;
        System.out.println(maxi.maximum69Number(num));
    }
}
