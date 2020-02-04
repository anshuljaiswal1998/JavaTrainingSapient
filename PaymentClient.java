public class PaymentClient{
    public static void main(String[] args) {
        PaymentGateway gateway = null;
        if(args[0].equals("1")){
            gateway = new GooglePay();
        }else{
            gateway = new Paytm();
        }

        gateway.pay("Anshul", "Sam",10_000, " Money for Dinner ");
        
    }
}