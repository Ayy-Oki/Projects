package AssigmentVIII;
import java.util.Scanner;
public class DigitSum {


public static int sumOfDigits(int n){
/// base case is for when its stops. This case when it less then 10
if(n <10) return n;

////recursive case is when you want it to continue. It'll keep going as long as its over 10 or equal to it
return n % 10 + sumOfDigits(n/10);

}

public static void main(String [] args){
       //scanner to try varity of inputs
    Scanner scnr = new Scanner(System.in);

    System.out.println("Hello! I will calculate the sum for you!");
    System.out.println("Enter a positive integer please:  ");

    int n = scnr.nextInt();

//// Call the sumOfDigits method with n and store the result in a variable sum
   int sum =  sumOfDigits(n);

    System.out.println("Sum of digits for " + n + ": " +  sum );


}

}
