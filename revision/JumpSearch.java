package revision;

public class JumpSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int find = 5;
        System.out.println(jumpSearch(arr,find));
    }

    private static int jumpSearch(int[] arr, int find) {
        int len = arr.length;
        int blocks = (int)Math.floor(Math.sqrt(len));
        int prev = 0;
        while (arr[Math.min(len,blocks)-1] < find){
            prev = blocks;
            blocks += (int)Math.floor(Math.sqrt(len));
            if (prev >= len) return -1;
        }
        // linear search
        while (arr[prev] < find){
            prev++;
            if (prev == Math.min(blocks,len)) return -2;
        }
        if (arr[prev] == find) return prev;
        return -1;
    }
}
