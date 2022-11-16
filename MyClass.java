/*

   Time Complexity- O(n^2)
   Space Complexity - (4*int)
 */
import java.util.Scanner;
class MyClass{
    int[] rotate(int[] io, int p, int d) {
        if (d == 0) leftRotate(io,io.length,p);
        else rightRotate(io,io.length,p);
        return io;
    }

    // right rotate upto p times
    void rightRotate(int[] arr, int size, int p) {
        for (int i = 0; i < p; i++)
            rightRotateByOne(arr,size);
        return;
    }

    // right rotate by once
    void rightRotateByOne(int[] arr, int size){
        int i, temp;
        temp = arr[size-1];
        for (i = size-1; i > 0; i--)
            arr[i] = arr[i-1];
        arr[0] = temp;
    }

    // left rotate upto p times
    void leftRotate(int[] arr, int size, int p){
        for (int i = 0; i < p; i++)
            leftRotateByOne(arr,size);
        return;
    }

    // left rotate by once
    void leftRotateByOne(int[] arr, int size) {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < size-1; i++)
            arr[i] = arr[i+1];
        arr[size-1] = temp;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter p: ");
        int p = sc.nextInt();
        System.out.print("Enter d: ");
        int d = sc.nextInt();
        int[] io = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("io["+i+"] = ");
            io[i] = sc.nextInt();
        }

        int[] ans = obj.rotate(io,p,d);

        for (int i: ans)
            System.out.print(i+" ");

    }

}