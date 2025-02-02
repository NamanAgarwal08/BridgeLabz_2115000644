public class Library {
    
    private String title;
    private String author;
    private int price;
    private boolean availability;

    //defaut Constructor
    public Library() {
        this("Meri Book", "Nahi Bataaunga", 10000, true);
    }

    //parameterized Constructor
    public Library(String title, String author, int price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
        System.out.println("Availability: " + this.availability);
    }

    public void borrowBook() {
        if (this.availability) {
            switchAvailability();
            System.out.println("Book Borrowed!");
        } else {
            System.out.println("This book is not available!");
        }
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean showAvailability() {
        return this.availability;
    }

    public void switchAvailability() {
        this.availability = !this.availability;
    }

}
