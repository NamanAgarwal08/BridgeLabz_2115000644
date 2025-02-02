public class EBook extends Book {

    public int edition;

    public EBook(int ISBN, String title, String author, int edition) {
        super(ISBN, title, author);
        this.edition = edition;
    }

    public void displayEDetails() {

        System.out.println("ISBN: " + this.ISBN); //public
        
        System.out.println("Title: " + this.title); // accessing protected instance
        
        System.out.println("Author: " + getAuthor());// accesing private through getter
        
        System.out.println("Edition: " + this.edition); //public 
    
    }
    
}
