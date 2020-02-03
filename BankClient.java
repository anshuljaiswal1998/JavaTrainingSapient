import java.util.Scanner;

public class BankClient {
    public static void main(String[] args) {
        Bank b = new Bank();
        Scanner scn = new Scanner(System.in);
        double amount;
        System.out.println("Enter amount to be added ");
        amount = scn.nextDouble();
        b.deposit(amount);
        System.out.println("Balance is - " + b.balanceCheck());
        int amount2;
        System.out.println("Enter amount to be withdrawed ");
        amount2 = scn.nextInt();
        if (b.withdraw(amount2) == 0.0) {
            System.out.println("Error occured, enter low amount than balance");

        } else {
            System.out.println("Balance is - " + b.balanceCheck());
        }

    }
}