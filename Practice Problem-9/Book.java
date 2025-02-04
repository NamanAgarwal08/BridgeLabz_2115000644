class Book {
    static String libraryName = "Library of Gurgoan";
    String title;
    String author;
    final int isbn;

    Book() { // default contructor
        this("default", "xyz", 0000);
    }

    Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName(Object b) {
        if (b instanceof Book)
            System.out.println("Library Name is : " + libraryName);
        else
            System.out.println("Not an instance of Book class");
    }
}