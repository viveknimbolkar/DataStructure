package algorithms.mathematical;
// https://www.geeksforgeeks.org/write-a-c-program-to-calculate-powxn/
public class Power {

    int pow(int x, int y){
        // if the power is zero then return nothing
        if (y == 0) return -1;
        else if (y%2 == 0) return pow(x,y/2) * pow(x,y/2); // if y is even number
        else return x * pow(x,y/2) * pow(x,y/2); // if y is odd no.
    }

    public static void main(String[] args) {
        Power power = new Power();
        int a = 5;
        int b = 3;
        System.out.println(power.pow(a,b));
    }
}
