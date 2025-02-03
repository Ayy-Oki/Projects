package Projects.PaymentProcessing;

public class PayPalPayment extends Payment {


    ////Create two classes, CreditCardPayment and PayPalPayment, that extend the Payment class.
 public PayPalPayment(double amount){

     super(amount);

 }
//// CreditCardPayment: Simulate processing a credit card payment by printing a message indicating that the payment is being processed via credit card.
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Paypal payment of $"+ amount);

    }
}
