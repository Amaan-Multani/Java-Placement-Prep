package Loops;
import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        // Print the Sum of First n Natural Numbers
        // n = 4
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number = ");
        int n =sc.nextInt();

        int sum = 0;
        for(int i = 0; i<=n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }
}
