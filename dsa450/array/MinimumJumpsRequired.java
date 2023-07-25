package dsa450.array;

public class MinimumJumpsRequired {

    int minJumps(int[] arr){
        if(arr[0] == 0) return -1;
        int jumps = 0, maxReach = 0, currEnd = 0;

        for (int i = 0; i < arr.length; i++) {
            // find out the max reach at i
            maxReach = Math.max(maxReach,arr[i]+i);

            // if we reach to end
            if (maxReach >= arr.length-1) return ++jumps;

            // if index and maxreach is eqla means we we can't jump
            if (i == maxReach) return -1;

            if (i == currEnd){
                jumps++;
                currEnd = maxReach;
            }
        }

        return jumps;
    }

    public static void main(String[] args) {
        MinimumJumpsRequired minjump = new MinimumJumpsRequired();
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minjump.minJumps(arr));
    }
}
