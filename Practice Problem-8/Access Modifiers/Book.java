public class Book {
    
    public int ISBN;
    protected String title;
    private String author;

    public Book(int ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("ISBN: " + this.ISBN + "\nTitle: " + this.title + "\nAuthor: " + this.author);
    }
    
    // getter and setter for author
    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
