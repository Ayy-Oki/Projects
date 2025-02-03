package Projects.AssigmentIV;

public class Electronics extends Product{

private int warranty;

//default constructor for child class
public Electronics(int productID,String name, double price, int quantity, int warranty){

super(productID,name,price,quantity);
this.warranty= warranty;

}


    @Override
    public double calculateTotalValue() {

    return getQuantity() * getPrice() * 1.10 ;

    }


    //////Override toString to include warranty information in the product details.
    @Override
    public String toString() {
    return super.toString() + "Warranty Period " + warranty + " " + "" + "months\n"+ "Total Value (with handling fee):" + "$"+  String.format("%2f",calculateTotalValue()) + "\n" ;
    }
}









