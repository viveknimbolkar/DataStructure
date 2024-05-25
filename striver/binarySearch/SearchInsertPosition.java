
package striver.binarySearch;
//https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {

    // Complexity = Time= O(logN) Space=O(1)
    int find(int[] arr,int x){
        int left = 0, right = arr.length-1;
        int ans = right;
        System.out.println("right"+right);
        System.out.println("ans"+ans);
        System.out.println("left"+left);

        while(left <= right){

            System.out.println("right"+right);
            System.out.println("ans"+ans);
            System.out.println("left"+left);
            int mid = (left + right) / 2;

            if(arr[mid] == x) return mid;

            if(arr[mid] >= x){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] arr = {1,2,4,7};
        int x = 6;
        System.out.println(searchInsertPosition.find(arr,x));
    }
}
