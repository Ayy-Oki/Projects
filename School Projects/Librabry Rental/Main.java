package Projects;

import java.util.Scanner;

public class Main {

    public static void main(String [] args ){


        //// Use a menu-driven console interface to:
        //Add items (books or DVDs) to the library.
        //Add members to the library.
        //Allow members to borrow items.
        //Allow members to return items.
        //Display the library's state.
        //Exit the program.


        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.println("1. Add item");
        System.out.println("2. Add member");
        System.out.println("3. Borrow item");
        System.out.println("4. Return item");
        System.out.println("5. Display Library State");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        option = scanner.nextInt();
       scanner.nextLine();

      switch (option){

          case 1: // Add item
              System.out.println("Enter title: ");
              String title = scanner.nextLine();
              System.out.println("Enter creator: ");
              String creator = scanner.nextLine();
              System.out.println("Enter item ID: ");
              int itemId = scanner.nextInt();
              scanner.nextLine(); // Consume newline
              System.out.println("Is it a book or DVD (B/D)?");
              char type = scanner.next().charAt(0);
              scanner.nextLine(); // Consume newline

              if (type == 'B') {
                  System.out.print("Enter genre: ");
                  String genre = scanner.nextLine();
                  System.out.print("Enter number of pages: ");
                  int pages = scanner.nextInt();
                  library.addItem(new Book(title, creator, itemId, genre, pages));

              } else if (type == 'D') {
                  System.out.println("Enter director: ");
                  String director = scanner.nextLine();
                  System.out.println("Enter duration (in minutes): ");
                  int duration = scanner.nextInt();
                  library.addItem(new DVD(title, creator, itemId, director, duration));
              }
              break;

          case 2: // Add member
              System.out.println("Enter name: ");
              String name = scanner.nextLine();
              System.out.println("Enter address: ");
              String address = scanner.nextLine();
              System.out.println("Enter contact: ");
              String contact = scanner.nextLine();
              System.out.println("Enter member ID: ");
              int memberId = scanner.nextInt();
              library.addMember(new LibraryMember(name, address, contact, memberId));
              System.out.println("Member added successfully.");
              break;

          case 3: // Borrow item
              System.out.println("Enter member ID: ");
              memberId = scanner.nextInt();
              System.out.println("Enter item ID to borrow: ");
              itemId = scanner.nextInt();

              LibraryMember borrowingMember = null;
              LibraryItem borrowingItem = null;

              // Find the member by memberId
              for (LibraryMember member : library.members) {
                  if (member != null && member.getMemberId() == memberId) {
                      borrowingMember = member;
                      break;
                  }
              }

              // Find the item by itemId
              for (LibraryItem item : library.items) {
                  if (item != null && item.getItemId() == itemId) {
                      borrowingItem = item;
                      break;
                  }
              }

              if (borrowingMember != null && borrowingItem != null) {
                  borrowingMember.borrowItem(borrowingItem);
              } else {
                  System.out.println("Invalid member or item ID.");
              }
              break;

          case 4: // Return item
              System.out.println("Enter member ID: ");
              memberId = scanner.nextInt();
              System.out.println("Enter item ID to return: ");
              itemId = scanner.nextInt();

              LibraryMember returningMember = null;
              LibraryItem returningItem = null;

              // Find the member by memberId
              for (LibraryMember member : library.members) {
                  if (member != null && member.getMemberId() == memberId) {
                      returningMember = member;
                      break;
                  }
              }

              // Find the item by itemId
              for (LibraryItem item : library.items) {
                  if (item != null && item.getItemId() == itemId) {
                      returningItem = item;
                      break;
                  }
              }

              if (returningMember != null && returningItem != null) {
                  returningMember.returnItem(returningItem);
              } else {
                  System.out.println("Invalid member or item ID.");
              }
              break;

          case 5: // Display library state
              System.out.println(library.toString()); // Assuming Library class has a toString method to display its state
              break;

          case 6: // Exit
              System.out.println("Exiting...");
              return; // Exit the program

          default:
              System.out.println("Invalid option. Please try again.");
      }
    }
}
