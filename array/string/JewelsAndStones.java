package array.string;
// https://leetcode.com/problems/jewels-and-stones/submissions/
public class JewelsAndStones {

    int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i = 0; i < jewels.length(); i++){
            for(int j = 0; j < stones.length(); j++){
                if(jewels.charAt(i) == stones.charAt(j)) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        JewelsAndStones jev = new JewelsAndStones();
        String jewels = "aA", stones = "aAAbbbb";
        System.out.println(jev.numJewelsInStones(jewels,stones));
    }
}
