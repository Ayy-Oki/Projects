package Projects.AssigmentIV;


 abstract public class Product {

private int productID;
private String name;
private double price;
private int quantity;

//default constructor
public Product(int productID, String name, double price, int quantity){

    this.productID = productID;
    this.name=name;
    this.price = price;
    this.quantity =quantity;


}

    ///Accessor and mutator methods for all attributes


////setter for productID

    public void setProductID(int productID){

    this.productID =productID;

    }



///getter for productID

    public int getProductID(){

     return productID;

    }

/////setter for name

    public void setName(String name){

    this.name = name;

    }

////getter for name

    public String getName(){

    return name;

    }

    ///// setter for price

    public void setPrice(double price){

    this.price = price;


    }

    ///getter for price
    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity){

    this.quantity = quantity;

    }

    public int getQuantity(){

    return quantity;

    }


    public abstract double calculateTotalValue ();


//checks for negatives
public void restock (int addedquantity){
if(addedquantity < 0) {
System.out.println("Cannot restock with a negative number ");
return;
}
quantity = addedquantity + quantity;

}


    @Override
    public String toString() {
        return "Product ID: " + productID + "\n" + "Name: " + name + "\n" + "Price:" + "$" +  price  + "\n" + "Quantity: " + quantity +"\n";

    }
}



