import java.util.*;
public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of a = ");
        int a = sc.nextInt();
        System.out.println("Enter the Value of b = ");
        int b = sc.nextInt();
        
        if (a == b) {
            System.out.println("Equal");
        } else{
            if (a > b) {
                System.out.println("a is Greater");
            } else{
                System.out.println("a is lesser");
            }
            sc.close();
        }
    }
}
