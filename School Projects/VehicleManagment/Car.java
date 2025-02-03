package Projects.VehicleManagment;

////car class

///defines car class that extends the vehicle one
public class Car extends Vehicle {


    //add attribute for number of doors
    private int numOfdoors;

////Implement a constructor that initializes the attributes of Vehicle as well as the number of doors.

    public Car(String make, String model, int year, int numOfdoors) {

        super(make, model, year);
        this.numOfdoors = numOfdoors;

    }

    ////Override the method from Vehicle to display information specific to cars, including the number of doors.

    @Override

    public void Display(){

        super.Display();

        System.out.println("Number of Doors: " + numOfdoors);



  }

////Override the method to return a formatted string including the number of doors.
 @Override
  public String FormatDisplay(){

        super.FormatDisplay();

        return "Number of Doors: " + numOfdoors;


  }




}
