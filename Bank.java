public class Bank {

    private double balance = 0;

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        if (balance < amount) {
            return 0.0;
        } else {
            return balance = balance - amount;
        }
    }

    public double balanceCheck() {
        return this.balance;
    }

}