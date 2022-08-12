package recursion;
//https://practice.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1
public class TowerOfHanoi {

    void towerOfHanoi(int n, char from, char to, char aux){
        if (n == 1) return;
        // move all n-1 rods from to aux
        towerOfHanoi(n-1,from,aux,to);
        System.out.println("move disk "+n+" from" +from+" to "+to);
        // then move back n-1 rods from aux to to
        towerOfHanoi(n-1,aux,to,from);
    }

    public static void main(String[] args) {
        TowerOfHanoi tower = new TowerOfHanoi();
        // 10 disks and consider three columns a,b,c
        tower.towerOfHanoi(10,'A','B','C');
    }
}
