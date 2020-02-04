public class Paytm implements PaymentGateway{

    @Override
    public void pay(String from, String to, double amount, String comment) {
        System.out.println("Paid "+amount+ " from "+ from + " to " + to + " with comments "+ comment + " using Paytm");
    }

    @Override
    public void acceptPayment(String from, String to, double amount) {
        System.out.println("Accepted "+amount+ " from "+ from + " to " + to + " using Paytm");
    }
    
}