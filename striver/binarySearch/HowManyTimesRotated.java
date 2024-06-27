package striver.binarySearch;

public class HowManyTimesRotated {

    // using linear search
    int findKRotation(int arr[]) {
        for(int i = 0; i < arr.length - 1;i++){
            if(arr[i+1] < arr[i]){
                return i+1;
            }
        }
        return 0;
    }

    // using binary search
    // Time = O(logN) Space = O(1)
    // problem is like find the min of array, just keep track of index
    int findUsingBS(int[] arr){
        int index = -1, ans = Integer.MAX_VALUE, left = 0, right = arr.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            // rotated upto 0 times
            if(arr[left] <= arr[right]){
                if(arr[left] < ans){
                    index = left;
                    ans = arr[left];
                    break;
                }
            }

            //find in left half sorted
            if(arr[left] <= arr[mid]){
                if(arr[left] < ans){
                    index = left;
                    ans = arr[left];
                }
                left = mid + 1;
            }

            // find in right half sorted
            if(arr[mid] <= arr[right]){
                if(arr[mid] < ans){
                    index = mid;
                    ans = arr[mid];
                }
                right = mid - 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        HowManyTimesRotated how = new HowManyTimesRotated();
        int[] arr = {5, 1, 2, 3, 4};
        System.out.println(how.findKRotation(arr));
    }
}
