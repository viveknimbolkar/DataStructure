package dcscracker;

public class FindSquareRoot {
    int findSquare(int x){
        int sqrt = 0;
        int i = 1;
        while (i*i<=x){
            sqrt++;
            i++;
        }
        return sqrt;
    }

    //Method 2: using binary search

    public static void main(String[] args) {
        FindSquareRoot tt = new FindSquareRoot();
        System.out.println(tt.findSquare(25));
    }
}
