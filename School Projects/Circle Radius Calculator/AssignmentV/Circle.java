package AssignmentV;

import java.lang.Math.*;

public class Circle extends Shape implements Resizable {

private double radius;

/// Constructor that takes radius

 public Circle (String name, String color, double radius){

     super(name, color);
     this.radius = radius;

 }


 /// set and getters

 public void setRadius(double radius){

     this.radius =radius;

 }

 public double getRadius(){

     return radius;

 }



 //implement the abstract methods in each subclass to calculate the area and perimeter of the respective shapes.

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius,2);
    }


    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }


    /////increasing in size, as per Shapetest main class
    @Override
    public void resize(int percent) {

     radius = radius + (radius * ((double) percent /100));

    }
}
