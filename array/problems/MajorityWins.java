package array.problems;

//Unsolved
public class MajorityWins {

    int findMajority(int[] arr, int x, int y){
        //get the smaller and larger no.
        int small= Math.min(x,y);
        int large = Math.max(x,y);

        // get the ocunt of both element
        int cx = getCount(arr,x);
        int cy = getCount(arr,y);

        if (cx==cy) return large;

        return small;
    }

    int getCount(int[] arr, int f){
        int temp = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == f)
                temp++;

        return temp;
    }


    public static void main(String[] args) {
        MajorityWins majorityWins = new MajorityWins();
        int[] arr = {1,2,4,4,4,5};
        System.out.println(majorityWins.findMajority(arr,4,5));
    }
}
