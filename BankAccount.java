
public class BankAccount {

    private double balance = 0;
    private Address address;
    private Account_Type accountType;
    private long account_Id ;
    private static long INITAL_ACCOUNT_ID_VALUE = 10_000;

    public BankAccount(Account_Type accountType, double initAmount, Address address) {
        this.address = address;
        account_Id = INITAL_ACCOUNT_ID_VALUE++;
        this.INITAL_ACCOUNT_ID_VALUE ++;
        switch (accountType) {
            case SALARIED_ACCOUNT:
                if ((this.balance) > 0) {
                    this.balance = initAmount;
                }
                break;

            case SAVINGS_ACCOUNT:
                if ((this.balance) > 10_000) {
                    this.balance = initAmount;
                }else{
                    this.balance = 10_000;
                }
                break;
            case CURRENT_ACCOUNT:
                if ((this.balance) > 25_000) {
                    this.balance = initAmount;
                }else{
                    this.balance = 25_000;
                }
                break;
            default:
                break;
        }

    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {

        switch (this.accountType) {
        case SALARIED_ACCOUNT:
            if ((this.balance - amount) > 0) {
                this.balance = this.balance - amount;
                return amount;
            }
            return 0;
        case SAVINGS_ACCOUNT:
            if ((this.balance - amount) > 10_000) {
                this.balance = this.balance - amount;
                return amount;
            }
            return 0;
        case CURRENT_ACCOUNT:
            if ((this.balance - amount) > 25_000) {
                this.balance = this.balance - amount;
                return amount;
            }
            return 0;
        default:
            return 0;
        }

    }

    public double balanceCheck() {
        return this.balance;
    }

    public void updateAddress(Address address){
        this.address = address;
    }

    
    public Account_Type getaccountType() {
        return this.accountType;
    }

    public long getAccountID(){
        return this.account_Id;
    }
}