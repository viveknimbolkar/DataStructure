package array;

public class RotationUsingJugglingMethod {

    void leftRotate(int[] arr, int size, int rotateby){
        rotateby = rotateby % size;
        int i,j,k,temp;// to store set values
        int gcd = gcd(rotateby, size);

        for (i = 0; i < gcd; i++) {
            temp = arr[i]; //store the first set of element
            j = i;
            while (true){
                k = j+rotateby;
                if (k >= size)
                    k = k-size;
                if(i == k) break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    //return the gcd of two numbers
    int gcd(int a, int b){
        if (b == 0) return a;
        else return gcd(b,a%b);
    }

    void printArray(int[] arr){
        for (int data:arr) {
            System.out.print(data+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RotationUsingJugglingMethod rujm = new RotationUsingJugglingMethod();
        int[] arr = {10,20,30,40,50,60,70};

        rujm.printArray(arr);

        rujm.leftRotate(arr,arr.length,2);

        rujm.printArray(arr);
    }
}
