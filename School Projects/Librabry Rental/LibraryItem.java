package Projects;

public class LibraryItem   {

    ////Atributes title, creater, itemId, avalaible

    private String title;
    private String creator;
    private int itemID;
    private boolean available;

    ///constructor

    public LibraryItem(String title,String creator,int itemID){

        this.title = title;
        this.creator = creator;
        this.itemID = itemID;
        this.available = true;

    }


    /// checks out item, default is true, once added the boolean is set to false
    public void checkoutItem(){
        if(available){
        available = false;
        }else{

            System.out.println("Item is not available for borrowing");
        }
    }



    public void returnItem(){

        available = true;

    }


//// outputs availablitly

    public boolean isAvailable(){
      return available;

    }

///getter
    public int getItemId(){
      return itemID;

    }





}