package array.problems;
// https://leetcode.com/problems/flipping-an-image/
public class FlipImage {
    /* how to flip image:
     To flip an image horizontally means that each row of the image is reversed.
     To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
    */
    int[][] flipAndInvertImage(int[][] image) {
        // reverse each and every row of image
        for (int i = 0; i < image.length; i++)
            reverseArray(image[i],0,image.length);

        // make all the 0 -> 1 and 1 -> 0
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0) image[i][j] = 1;
                else image[i][j] = 0;
            }
        }
        return image;
    }

    // recursive reverse function
    void reverseArray(int[] a, int l, int r){
        if (l >= r/2) return;
        swap(a,l,r-l-1);
        reverseArray(a,l+1,r);
    }

    // swap function
    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        FlipImage flip = new FlipImage();
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}};

        int[][] flippedImage = flip.flipAndInvertImage(image);

        //print flipped image
        for (int i = 0; i < flippedImage.length; i++) {
            for (int j = 0; j < flippedImage[i].length; j++) {
                System.out.print(flippedImage[i][j]+" ");
            }
            System.out.println();
        }
    }
}
