package predefined;
public class PredefinedMethods {

    public void printArray(int[] arr){
        for (int a:arr)
            System.out.print(a+" ");
        System.out.println();
    }

    public int getGcd(int a, int b){
        if (b == 0) return a;
        return getGcd(a,a%b);
    }
}
