package Projects.VehicleManagment;

public class Motorcycle extends Vehicle {

    /// Add an attribute to store the engine capacity (in cc) of the motorcycle.
    private int enginecapacity;

    ///Implement a constructor that initializes the attributes of Vehicle as well as the engine capacity.
    public Motorcycle(String make, String model, int year, int enginecapacity) {

        super(make, model, year);
        this.enginecapacity = enginecapacity;


    }
   /// Override the method from Vehicle to display information specific to motorcycles, including the engine capacity.
    @Override
    public void Display() {

        super.Display();

        System.out.println("Engine Capacity is: " + enginecapacity +" Cc");


    }

    ////Override the method to return a formatted string including the number of doors.
    @Override
    public String FormatDisplay() {

        super.FormatDisplay();

        return "Engine Capacity is: " + enginecapacity + "Cc";
    }

}