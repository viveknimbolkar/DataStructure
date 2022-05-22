package array.problems;
// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
public class FindValueofVariable {

    int finalValueAfterOperations(String[] operations) {
        int var = 0;
        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]){
                case "X++": var++; break;
                case "X--": var--; break;
                case "++X": ++var; break;
                case "--X": --var; break;
            }
        }
        return var;
    }

    public static void main(String[] args) {
        FindValueofVariable find = new FindValueofVariable();
        String[] operations = {"--X","X++","X++"};
        System.out.println(find.finalValueAfterOperations(operations));
    }
}
