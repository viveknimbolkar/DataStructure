package striver.binarySearch;

public class FindSquareRoot {

    long findSquareRootUsingLinearSearch(long x){
        long ans = 1;
        for(int i = 1; i < x; i++){
            long val = i*i;

            if(val <= x){
                ans = i;
            }else{
                break;
            }
        }
        return ans;
    }

    // using binary search
    // T=O(lognN) Space = O(1)
    long findSquareRootUsingBS(long x){
        long left = 1, right = x;

        while(left <= right){
            long mid = left + (right - left) / 2;

            if(mid*mid <= x){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        FindSquareRoot findSquareRoot = new FindSquareRoot();

        int x = 5;
        System.out.println(findSquareRoot.findSquareRootUsingBS(x));
    }
}
