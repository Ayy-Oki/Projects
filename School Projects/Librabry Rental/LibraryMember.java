package Projects;

public class LibraryMember {

    ////atributes of the name, adress, contacnt, memebrid,


    private String name;
    private String address;
    private String contact;
    private int memberId;
    LibraryItem [] borrowedItems = new LibraryItem[10];   //// libraby item array called borrowesItems.

    private double fines;

    ///contstuctor

  public LibraryMember(String name, String address, String contact, int memberId){

      this.name =name;
      this.address =address;
      this.contact = contact;
      this.memberId =memberId;

  }

    public int getMemberId() {
        return memberId; ///getter method for the main
    }

  public void borrowItem(LibraryItem item){

      if(item.isAvailable()) {
          item.checkoutItem();

          LibraryItem[] AddedBorrowedItems = new LibraryItem[borrowedItems.length + 1];
          for (int i = 0; i < AddedBorrowedItems.length; i++) {
              AddedBorrowedItems[i] = borrowedItems[i];

          }

          AddedBorrowedItems[borrowedItems.length] = item;
          borrowedItems = AddedBorrowedItems;
          System.out.println("Item checked out successfully.");
      }else{

          System.out.println("Item isn't available ");

      }

  }


    public void returnItem(LibraryItem item){

    LibraryItem [] AddedBorrowedItems = new LibraryItem[borrowedItems.length -1];

    int count = 0;
    for (int i = 0; i < borrowedItems.length; i++){
        if(borrowedItems[i].getItemId() != item.getItemId()){
            AddedBorrowedItems[count++] = borrowedItems[i];
        }


    }

    borrowedItems = AddedBorrowedItems;
    item.returnItem();
    System.out.println("Item returned");

  }




}
