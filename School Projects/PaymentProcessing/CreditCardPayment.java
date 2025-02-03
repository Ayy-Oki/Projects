package Projects.PaymentProcessing;

public class CreditCardPayment extends Payment {

    public CreditCardPayment(double amount){

        super(amount);

    }
////PayPalPayment: Simulate processing a PayPal payment by printing a message indicating that the payment is being processed via PayPal.
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $"+ amount);

    }
}


