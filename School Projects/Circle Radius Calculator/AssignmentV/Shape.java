package AssignmentV;

abstract public class Shape {

    ////Properties: name (String) and color (String).
private String name;
private String color;

//constructor

    public Shape(String name, String color ){

   this.name =name;
   this.color=color;

    }


    ////set and getters

    public void setName(String name){

        this.name =name;

    }

    public String getName(){

        return name;
    }


    public void setColor(String color){

        this.color =color;
    }

    public String getColor(){

        return color;

    }


///Abstract methods: calculateArea() and calculatePerimeter().

    public abstract double calculateArea();

    public abstract double calculatePerimeter();


}
