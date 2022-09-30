package problems;
//https://leetcode.com/problems/satisfiability-of-equality-equations/
//https://www.youtube.com/watch?v=aJYISj0n1so
public class SatisfiabilityOfEqualityEquations {
    // store the parent of variables
    int[] parent;
    // find the parent of the variable
    // store the index of array as the parent of the variable
    int findParent(int u){
        return parent[u]==u?u:(parent[u]=findParent(parent[u]));
    }

    boolean equationsPossible(String[] equations) {
        parent = new int[26];

        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }
        // for equal variables
        for (String str: equations) {
            int p1 = findParent(str.charAt(0)-'a'); // var a
            int p2 = findParent(str.charAt(3)-'a'); // var b
            // if both variable are contradictory equal then store p1 as the parent of p2
            if (p1 != p2 && str.charAt(1) == '=')
                parent[p1] = p2;
        }

        // for not-equal variables
        for (String str: equations) {
            int p1 = findParent(str.charAt(0)-'a'); // var a
            int p2 = findParent(str.charAt(3)-'a'); // var b
            // if both variable are contradictory equal then store p1 as the parent of p2
            if (p1 == p2 && str.charAt(1) == '!')
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        SatisfiabilityOfEqualityEquations satisfy = new SatisfiabilityOfEqualityEquations();
        String[] equations = {"a==b","b!=a"};

        System.out.println(satisfy.equationsPossible(equations));
    }
}
