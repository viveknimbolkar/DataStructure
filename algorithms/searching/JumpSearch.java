package algorithms.searching;

public class JumpSearch {

    public static void main(String[] args) {
        JumpSearch js = new JumpSearch();
        int[] elements = {10,20,30,40,50,60,70,80,90,100};
        int search = 70;
        System.out.println(js.jumpSearch(elements, search));
    }

    int jumpSearch(int[] arr, int findElement){
        int length = arr.length;
        //find the number of blocks
        int numOfBlocks = (int)Math.floor(Math.sqrt(length));

        int prev = 0;
        //find the block containing the findElement
        while (arr[Math.min(numOfBlocks, length) - 1] < findElement){
            prev = numOfBlocks;
            numOfBlocks = numOfBlocks + (int) Math.floor(Math.min(numOfBlocks, length));
            if (prev >= length)
                return -1;
        }

        //perform linear search inside the prev block
        while (arr[prev] < findElement){
            prev++;
            if (prev == Math.min(numOfBlocks,length))
                return -1;
        }

        //compare the element
        if (arr[prev] == findElement)
            return prev;

        return 0;
    }
}
