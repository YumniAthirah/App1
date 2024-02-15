package Assignment.Assignment5.A8;

public interface PaymentGateway {
    void processPayment(double amount); // Processes a payment.
    boolean isPaymentSuccessful();      // Checks if the payment was successful.

}
