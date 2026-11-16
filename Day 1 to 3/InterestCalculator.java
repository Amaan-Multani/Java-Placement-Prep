import java.util.*;
public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount P =");
        int p = sc.nextInt();
        System.out.println("Enter Rate of Interest R =");
        double r = sc.nextDouble();
        System.out.println("Enter Time in Years T =");
        int t = sc.nextInt();
        double si = (p*r*t/100);
        System.out.println("Simple Interest = " + si);
        System.out.println("Total Amount ="+ (p + si) );
        sc.close();
    }
}
