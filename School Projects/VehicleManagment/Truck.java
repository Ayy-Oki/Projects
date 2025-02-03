package Projects.VehicleManagment;

public class Truck extends Vehicle{

   /// Add an attribute to store the payload capacity (in tons) of the truck.
  private double payloadcapacity;

    ///Implement a constructor that initializes the attributes of Vehicle as well as the payload capacity.
public Truck(String make, String model, int year, double payloadcapacity){

      super(make, model, year);
      this.payloadcapacity = payloadcapacity;


}

    //Override the method from Vehicle to display information specific to trucks, including the payload capacity.

    @Override
    public void Display() {

        super.Display();

        System.out.println("Payload Capacity is:  " + payloadcapacity +"T");


    }

    ////Override the method to return a formatted string including the payload capacity.
    @Override
    public String FormatDisplay() {

        super.FormatDisplay();

        return "Payload Capacity is:  " + payloadcapacity + "T";
    }

}


