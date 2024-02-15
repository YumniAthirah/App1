package lesson8.Assignment.A8PaymentGatewayIntegration;

public interface PaymentGateway {
    void processPayment(double amount); // Processes a payment.
    boolean isPaymentSuccessful();      // Checks if the payment was successful.

}
