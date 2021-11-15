package array.rotation;

public class JugglingMethod {

    void leftRotate(int[] arr, int size, int rotateby){
        rotateby = rotateby % size;
        int i,j,k,temp;// to store set values
        int gcd = gcd(rotateby, size);

        for (i = 0; i < gcd; i++) {
            temp = arr[i]; //store the first set of element
            j = i;
            while (true){
                k = j+rotateby; // in k we are getting the elements of next set
                if (k >= size) // if we are trying to access out of bound index element
                    k = k-size; // then get the last element of the respective set
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
        JugglingMethod rujm = new JugglingMethod();
        int[] arr = {10,20,30,40,50,60,70};

        rujm.printArray(arr);

        rujm.leftRotate(arr,arr.length,2);

        rujm.printArray(arr);
    }
}
