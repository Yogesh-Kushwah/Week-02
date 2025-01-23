//Create the class
class Book{

    //Declaration of the instance variables
    String title;
    String author;
    final int isbn;
    static String libraryName;

    //Create the constructor to initialize the values to the variables
    Book(String title,String author,int isbn,String libraryName){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        Book.libraryName = libraryName;
    }
    //Create the static method according to the question
    public static void displayLibraryName(){
        System.out.println("The name of the library is : "+libraryName);
    }
    //Creation of the display method
    public void display(){
        System.out.println("The title of the book is : "+title);
        System.out.println("The Author of the book is : "+author);
        System.out.println("The isbn number of the book is : "+isbn);
    }
}
//Main method of the program
public class LibraryManagementSystem {
    public static void main(String[] args) {
        //creation of the object for the class
Book obj = new Book("Training","BridgeLabz",9087,"Bhopal Library");

//Check the object is the instance of the class or not
        System.out.println("The object is the instance of the class or not : "+(obj instanceof Book));

        //call the function displayLibraryName
        Book.displayLibraryName();
        //Call the display function
        obj.display();
    }
}
