import java.util.Random;

public class GooglePay implements PaymentGateway {

    Random rand = new Random();
    
    @Override
    public void pay(String from, String to, double amount, String comment) {
        System.out.println("Paid "+amount+ " from "+ from + " to " + to + " with comments "+ comment + " using GooglePay");
        System.out.println("\nHere's your Unique Number "+ ScratchCard());
    }

    @Override
    public void acceptPayment(String from, String to, double amount) {
        System.out.println("Accepted "+amount+ " from "+ from + " to " + to + " using GooglePay");
    }

    public int ScratchCard(){
        return rand.nextInt(10);
    }
    
}