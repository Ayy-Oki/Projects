package Projects;

public class Book extends LibraryItem{

  ///atributes genre, and number of pages

  private String genre;
  private int numberOfPages;


  ///constructor

   public Book(String title, String creator, int itemId, String genre, int numberOfPages){

     super(title,creator,itemId); /// super type that creates intstace of the parent class
     this.genre = genre;
     this.numberOfPages= numberOfPages;

  }

}
