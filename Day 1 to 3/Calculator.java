import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter First Number = ");
        int a = sc.nextInt();
        System.out.println(" Enter Second Number = ");
        int b = sc.nextInt();
        System.out.println("Choose operation: 1 for (+), 2 for (-), 3 for (*), 4 for (/), 5 for (%)");
        int operator = sc.nextInt();

        switch (operator) {
            case 1 : System.out.println(a + b);
            break;
            case 2 : System.out.println(a - b);
            break;
            case 3 : System.out.println(a * b);
            break;
            case 4 : System.out.println(a / b);
            break;
            case 5 : System.out.println(a % b);
            break;
            default:
    System.out.println("Invalid Operator! Please enter between 1 to 5");
        }
        sc.close();
    }
}
