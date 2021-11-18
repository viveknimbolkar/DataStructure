package array;

//Unsolved
public class MajorityWins {

    int findMajority(int[] arr, int x, int y){
        //get the smaller and larger no.
        int small,large;
        if (x>y) {
            small = y;
            large = x;
        }else{
            small = x;
            large = y;
        }

        // get the ocunt of both element
        int cx = getCount(arr,x);
        int cy = getCount(arr,y);

        if (cx==cy){
            return small;
        }else if (cy>cx || cx>cy){
            return large;
        }
        return large;
    }

    int getCount(int[] arr, int f){
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == f)
                temp++;
        }
        return temp;
    }


    public static void main(String[] args) {
        MajorityWins t = new MajorityWins();
        int[] arr = {1,2,4,4,4,5};
        System.out.println(t.findMajority(arr,4,5));
    }
}
