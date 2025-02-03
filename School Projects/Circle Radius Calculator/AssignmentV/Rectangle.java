package AssignmentV;

public class Rectangle extends Shape implements Resizable {

private double length;
private double width;


////constructor that takes length and width

public Rectangle(String name,String color,double length, double width){

    super(name, color);
    this.length = length;
    this.width = width;

}

public void setLength(double length){

  this.length = length;

}


public double getLength(){

    return length;
}



public void setWidth(double width){

    this.width=width;

}

public double getWidth(){

    return width;
}


/// Implement the abstract methods in each subclass to calculate the area and perimeter of the respective shapes.


    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length * width);
    }


    @Override
    public void resize(int percent) {

    length =length + (length * ((double) percent /100));

    width = width + (width * ((double) percent /100));



    }
}


