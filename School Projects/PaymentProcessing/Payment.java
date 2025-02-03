package Projects.PaymentProcessing;

///abstract class called payment
abstract public class Payment {

  private double amount;

  public Payment(double amount){

      this.amount = amount;


  }



//// abstract method called processPayment

     public abstract void processPayment(double amount);

   /// A non-ab/stract method paymentReceipt
    ////prints a receipt for processed payment
  public void paymentReceipt(double amount){

    System.out.println("Payment of " + amount +  "$ has been processed" );

  }



}
