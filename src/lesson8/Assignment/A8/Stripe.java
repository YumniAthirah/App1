package lesson8.Assignment.A8;

public class Stripe implements PaymentGateway{

    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Processing payment of RM" + amount);
    }

    @Override
    public boolean isPaymentSuccessful() {
        return Math.random() * 100 > 90;
    }
    
}
