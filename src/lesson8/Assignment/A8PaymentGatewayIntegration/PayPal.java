package lesson8.Assignment.A8PaymentGatewayIntegration;

public class PayPal implements PaymentGateway {

    public void processPayment(double amount) {
        System.out.println("PAYPAL");
        System.out.println("Processing payment of RM" + amount);
    }

    @Override
    public boolean isPaymentSuccessful() {
        return Math.random() * 100 > 90;
    }

}
