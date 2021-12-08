package array.problems;

// https://www.codechef.com/problems/FLOW011
import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        GrossSalary cc = new GrossSalary();
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        for (int i = 0; i < testcase; i++) {
            int basicSalary = sc.nextInt();

            double salary = 0;
            if (basicSalary < 1500)
                salary = basicSalary + (basicSalary * 0.1) + (basicSalary * 0.9);
            else
                salary = basicSalary + 500 + (basicSalary * 0.98);

            System.out.println(salary);
        }

    }

    float findGrossSalary(int basicSalary, float HRA, float DA){
        return (basicSalary+HRA+DA);
    }
}
