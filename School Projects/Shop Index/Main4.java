package Projects.AssigmentIV;

public class Main4 {

    public static void main(String [] args){
        /// Create instances of Product, Electronics, and Furniture with sample data.
        Product furniture = new Furniture(374,"Desk",79.99,2,"Wood");
        Product electronics = new Electronics(2342, "Dell Laptop",799.99,5,12);




           ///Demonstates tostring
        System.out.println("Product Inventory:");
        //for spacing
        System.out.println("");
         System.out.println(furniture);
         System.out.println(electronics);

        //// Demonstrate the use of methods like restock, calculateTotalValue, and toString
        electronics.restock(3);
        furniture.restock(5);

        ///demosntrates restock
        System.out.println("Restocking Desk by 5 units....");
        System.out.println("Restocking Laptop by 3....");

        System.out.println("New Quantity of " +furniture.getName() + " is " + furniture.getQuantity());
        System.out.println("New Quantity of " +electronics.getName() + " is " + electronics.getQuantity());

         ///demonstrates calculateTotalValue
        System.out.println("New Total Value of "+ furniture.getName() + " is $"  + String.format("%.2f", furniture.calculateTotalValue()));
        System.out.println("New Total Value of "+ electronics.getName()+ " is $" + String.format("%.2f", electronics.calculateTotalValue()));
         ///Implement a method to display the total inventory value of the warehouse (all products combined).

        Product [] products = {electronics,furniture};
        double AllInventory = 0.0;
        for (Product product: products){

            AllInventory += product.getQuantity() * product.getPrice();

        }

        System.out.println("Total Invertory Value: " + "$" + AllInventory) ;
        System.out.println("");
    }




}
