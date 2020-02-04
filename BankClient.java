import java.util.Scanner;

public class BankClient {
    public static void main(String[] args) {
        Address address = new Address("411", "Safdarjung", "Delhi", 110007);
        BankAccount bankAccount = new BankAccount(Account_Type.SALARIED_ACCOUNT,20000, address);
        BankAccount bankArray[] = new BankAccount[10];
        for (int i = 0; i < 10; i++) {
            bankArray[i] = new BankAccount(Account_Type.SALARIED_ACCOUNT,20000, address);
            System.out.println(bankArray[i].getAccountID());
        }
        
        Scanner scn = new Scanner(System.in);
        double amount;
        System.out.println("Enter amount to be added ");
        amount = scn.nextDouble();
        bankAccount.deposit(amount);
        System.out.println("Balance is - " + bankAccount.balanceCheck());
        int amount2;
        System.out.println("Enter amount to be withdrawed ");
        amount2 = scn.nextInt();
        if (bankAccount.withdraw(amount2) == 0) {
            System.out.println("Error occured, enter low amount than balance");

        } else {
            System.out.println("Balance is - " + bankAccount.balanceCheck());
        }
        

    }
}