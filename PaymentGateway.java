public interface PaymentGateway{
    public abstract void pay(String from, String to, double amount, String comment);
    public abstract void acceptPayment(String from, String to, double amount);
}