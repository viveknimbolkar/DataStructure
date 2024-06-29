package striver.binarySearch;

//https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/
public class MinDaysToMakeBouquetes {

    // using linear search
    // time = O() space = O()
    int minDays(int[] bloomDays, int k, int m){
        int n = bloomDays.length;
        if(m*k > n) return -1; // impossible to create boquetes

        // find min and max
        int min = Integer.MIN_VALUE, max = Integer.MIN_VALUE;
        for(int x : bloomDays){
            min = Math.min(min,x);
            max = Math.max(max,x);
        }

        for(int i = min; i <= max; i++){
            if(isPossible(bloomDays,k,m,i))
                return i;
        }

        return -1;
    }

    int findUsingBS(int[] bloomDays, int k, int m){
        // find min and max
        int n = bloomDays.length;
        if(m*k > n) return -1; // impossible to create boquetes

        // find min and max
        int min = Integer.MIN_VALUE, max = Integer.MIN_VALUE;
        for(int x : bloomDays){
            min = Math.min(min,x);
            max = Math.max(max,x);
        }

        int left = min, right = max, ans = 0;
        while(left <= right){
            int mid = (left + right) / 2;

            if(isPossible(bloomDays,k,m,mid)){
                // eleminate right as current day also possible to create bouquetes
                ans = mid;
                right = mid - 1;
            }else{
                // eleminate left as current day also possible to create bouquetes
                left = mid + 1;
            }
        }
        return ans;
    }

    boolean isPossible(int[] bloomDays, int k, int m, int day){
        int cout = 0, bouquets = 0;

        for(int today: bloomDays){
            if(today <= day) cout++;
            else{
                bouquets += (cout/k);
                cout = 0;
            }
        }

        // add last day
        bouquets += (cout/k);

        return bouquets >= m;
    }


    public static void main(String[] args) {

        MinDaysToMakeBouquetes mindays = new MinDaysToMakeBouquetes();
        int[] bloomDays = {7,7,7,7,12,7,7};
    int m = 2, k = 3;
        System.out.println("min days: "+mindays.findUsingBS(bloomDays,k,m));
    }
}
