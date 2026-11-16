import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to Withdraw = ");
        int amount = sc.nextInt();
        int balance = 10000;

        if (amount > balance ) {
            System.out.println("Insufficient Balance You Have Only 10000rs");
        } else if (amount <= 0) {
            System.out.println("Invaild Amount Enter Positive Money");
        } else {
            balance = balance - amount;
            System.out.println("Withdraw Successful Cash");
            System.out.println("Remaining Balance =" + balance);
        }
        sc.close();

        }

    }

