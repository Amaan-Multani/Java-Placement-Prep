import java.util.*;
public class Tempconverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temp in Fahrenheit = ");
        double f = sc.nextDouble();
        double a = ((f - 32)*5.0/9.0);
        System.out.println("Temp in Celsius = " + a);
        sc.close();

    }
}
