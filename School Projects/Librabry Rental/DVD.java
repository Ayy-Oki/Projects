package Projects;

public class DVD extends LibraryItem {

    ///// atributes director and duration

    private String director;
    private int duration;


    ///the constructor

    public DVD (String title, String creator, int itemId, String director, int duration){

           super(title,creator, itemId); ///super type is there to pass along the atributes of the parent class
           this.director =director;      /// Library item class in this case
           this.duration= duration;


    }




}
