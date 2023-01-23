
import java.util.Scanner;
class MyClass{

    static int get(int n){
    int largest = 0;
        while(n != 0)
        {
            int r = n % 10;

            // Find the largest digit
            largest = Math.max(r, largest);


            n = n / 10;
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans+= get(arr[i]);
        }

        System.out.println(ans);
    }

}