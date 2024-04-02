
class MyClass{
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        int n = arr.length, m = arr[0].length;

        int top = 0, left = 0, bottom = n-1, right = m-1;

        while(top <= bottom && left <= right){
            // l -> r
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i]+" ");
            }
                top++;

            // t -> b
            for (int i = top; i <= bottom ; i++) {
                System.out.print(arr[i][right]);
            }
                right--;

            // r -> l
            if(top <= bottom){
                for (int i = right; i >= left ; i--) {
                    System.out.print(arr[bottom][i]);
                }
                    bottom--;
            }

            // b -> t
            if(left <= right){
                for (int i = bottom; i >= top ; i--) {
                    System.out.print(arr[i][left]);
                }
                    left++;
            }
            System.out.println();
        }
    }
}