import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Units = ");
        int units = sc.nextInt();
        double rate = 1.5;
        double rt = 2.5;
        double rs = 4.0;
        if (units < 100) {
            System.out.println(rate);
        } else if (101 == 200) {
            System.out.println(rate);
            System.out.println(rt);
        } else if (units > 200) {
            System.out.println(rate);
            System.out.println(rt);
            System.out.println(rs);
        }

        System.out.println("Final Bill = " + 50);
        sc.close();
    }
}
