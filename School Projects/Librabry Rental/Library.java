package Projects;

public class Library {


    LibraryItem[] items = new LibraryItem[10]; ///librabyItem array called items
    LibraryMember[] members = new LibraryMember[10]; //// Library Member array called members

    ///constrcutor
    public Library() {

    }

   /// adds items to cart count

    public void addItem(LibraryItem item) {
        LibraryItem[] AddedItems = new LibraryItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
                AddedItems[i] =items[i];

        }
            AddedItems[items.length] = item;
            items = AddedItems;
            System.out.println("Items added");

    }

    /// adds  memeber to cart count

    public void addMember(LibraryMember member) {
        LibraryMember[] AddedMember = new LibraryMember[members.length + 1];
        for (int i = 0; i < members.length; i++) {
             AddedMember[i] = members[i];
        }

            AddedMember[members.length] = member;
            members = AddedMember;
            System.out.println("Members added");



    }

    /// to string method prints the amount of items and members
        @Override
        public String toString() {
            return " Libray: Items - " + items.length + ",Members - " + members.length;
        }

}