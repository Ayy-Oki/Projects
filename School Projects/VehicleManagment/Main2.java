package Projects.VehicleManagment;

public class Main2 {


    public static void main(String [] args){

      Car car = new Car("Honda","Civic",2017,4);

      Motorcycle motorcycle = new Motorcycle("Ducati","S2R",2005, 150);

      Truck truck =new Truck("Ford","F1",2019, 1.5 );

  /////Display the information for each vehicle using the method you created to display details.
   //Also, display the formatted information using the method that returns a formatted string.

      System.out.println("Car Details:");
      ///for spacing
        System.out.println("");
      car.Display();
    car.FormatDisplay();
        System.out.println("");

        System.out.println("Motocycles Details:");
        System.out.println("");
         motorcycle.Display();
         motorcycle.FormatDisplay();
           ///for spacing
        System.out.println("");

        System.out.println("Truck Details:");
        System.out.println("");
        truck.Display();
        truck.FormatDisplay();



    }




}
