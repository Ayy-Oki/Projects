package Projects.VehicleManagment;

public class Vehicle {

    // added atrributes that store the variables of the vechile.
    private String make;
    private String model;
    private int year;

    // constructor initialezes the variables
    public Vehicle(String make, String model, int year){

        this.make = make;
        this.model =model;
        this.year = year;


    }

    //// Create a method to display the basic information of the vehicle, including the make, model, and year.
    public void Display(){

        System.out.println("Make:" + make );
         System.out.println("Model:" + model );
       System.out.println  ("Year:" + year );


    }


    public String FormatDisplay() {
        return  "Make:" + make + "model:" + model + "year" + year;
    }


}





