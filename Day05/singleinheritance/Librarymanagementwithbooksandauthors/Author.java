package singleinheritance.Librarymanagementwithbooksandauthors;

 class Author extends Book{


    String name;
    String bio;

 Author(String title, int publicationYear, String name, String bio) {

        this.title = title;
        this.publicationYear = publicationYear;
        this.name = name;
        this.bio = bio;
    }

      void displayInformtion(){
          System.out.println("Author Detail: "+ " Title "+title+" Name "+ name+" Bio"+bio+" PublicationYear "+publicationYear );
      }

}
