package Projects.AssigmentIV;

public class Furniture extends Product {

    private String materialType;


//////constructor for child class
    public Furniture(int productID,String name, double price, int quantity,String materialType){

    super(productID,name,price,quantity);
    this.materialType = materialType;

    }

    //////Override the calculateTotalValue method to account for electronics' value increasing by 10% (e.g., handling fees).
    @Override
    public double calculateTotalValue() {

        return getQuantity() * getPrice() * 1.05 ;


    }



    /////Override toString to include warranty information in the product details.

    @Override
    public String toString() {
        return super.toString() + "Material Type: " + materialType + "\n" + "Total Value (with handling fee):" + "$" +String.format("%2f",calculateTotalValue()) + "\n" ;
    }



}





