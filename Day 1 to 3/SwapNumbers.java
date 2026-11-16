import java.util.*;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Valuve of a :");
        int a = sc.nextInt();
        System.out.println("Enter the Valuve of b :");
        int b = sc.nextInt();
        System.out.println("Before Swapping a =" + a);
        System.out.println("b =" + b);
        int temp = a;
        a = b ;
        b = temp ;
        System.out.println("After Swapping a = " + a);
        System.out.println("b = " + b);
        sc.close();

    }
}
