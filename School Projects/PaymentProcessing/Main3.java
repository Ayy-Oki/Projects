package Projects.PaymentProcessing;

public class Main3 {

public static void main(String [] args ){
///Create an array of Payment references to store different payment method objects.
    Payment [] payments = new Payment[2];

///Instantiate CreditCardPayment and PayPalPayment objects and store them in the array.

    payments[0]  = new CreditCardPayment(100.0);
    payments[1]  = new PayPalPayment(100.0);

///Use a loop to iterate through the array and process a payment of $100 for each payment method.

for (Payment payment : payments){
    payment.processPayment(100.0);
   //// After processing the payment, print the payment receipt.
    payment.paymentReceipt(100.0);


}

}

}
