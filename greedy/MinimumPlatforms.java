package greedy;

import java.util.Arrays;

public class MinimumPlatforms {

    int findPlatform(int arr[], int dep[], int n){
        int i = 0, j = 0, platforms = 0, ans = 0;

        //sort arrival and departure time individually don't care about sequence
        Arrays.sort(arr);
        Arrays.sort(dep);

        // i for arrival
        // j for departure
        while (i < n && j < n){

            if (arr[i] <= dep[j]){
                platforms++; // more platforms are required to hold other trains
                i++;
            }else{
                platforms--; // platform is empty until next train cames so remove the current platform
                j++;
            }
            // get the max of ans and platforms remains in each iteration
            ans = Math.max(ans,platforms);
        }

        return ans;
    }

    public static void main(String[] args) {
        MinimumPlatforms minimumPlatforms = new MinimumPlatforms();
        int n = 6;
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println("Min platforms: "+minimumPlatforms.findPlatform(arr,dep,n));

    }
}
