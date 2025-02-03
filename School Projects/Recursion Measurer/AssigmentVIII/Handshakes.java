package AssigmentVIII;
import java.util.Scanner;

public class Handshakes {

    public static int totalHandshakes(int n){


        ////base case is for when its stops. This case when handshakes are either;
        ////less than or equal to one OR equal to 2.

        if(n <= 1 )return 0;
        if ( n ==2) return 1;

        ////recursive case is when you want it to continue. It'll keep going as long as handshakes are over 2
        return n - 1 + totalHandshakes(n - 1);

    }

    public static void main(String [] args ){
    Scanner scnr = new Scanner (System.in);


        ///Welcome Message to cleary convey the function of program
        System.out.println("Hello! In this program, I will: ");
        System.out.println("Keep track of how many Handshakes you've had");
        System.out.println("Plus, how many people you've had handshakes with in total!");

        System.out.println("Enter the total amount of people (Positive Integer Only): ");
        int n = scnr.nextInt();


         /////Call the totalHandshakes method with n and store the result in a variable total
        int total = totalHandshakes(n);



        System.out.println("Total number of handshakes for " + n +  " people: " + total  );



    }


}
