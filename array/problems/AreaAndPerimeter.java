package array.problems;

// https://codechef.com/problems/AREAPERI
import java.util.Scanner;

public class AreaAndPerimeter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breath = sc.nextInt();

        int area = length * breath;
        int perimeter = 2*(length + breath);

        if (area > perimeter){
            System.out.println("Area");
            System.out.println(area);
        }else if (perimeter > area){
            System.out.println("Peri");
            System.out.println(perimeter);
        }else{
            System.out.println("Eq");
            System.out.println(perimeter);
        }
    }
}
