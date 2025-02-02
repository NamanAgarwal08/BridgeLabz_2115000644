public class Main {
    public static void main(String[] args) {
        
        //Object for Student and PostgraduateStudent Classes
        Student s1 = new Student(1, "Name", 8.96);
        s1.displayDetails();

        PostgraduateStudent pg1 = new PostgraduateStudent(2, "Name2", 8.6, "Core CSE");
        pg1.displayPGDetails();


        //Object for Book and EBook
        Book b1 = new Book(1234, "Title", "Author");
        b1.displayDetails();

        EBook eb1 = new EBook(9876, "Title2", "Author2", 1);
        eb1.displayEDetails();

        
        //Object for BankAccount and SavingsAccount
        BankAccount bank1 = new BankAccount(10011001, "Me", 20000);
        bank1.displayDetails();

        SavingsAccount savings1 = new SavingsAccount(10011002, "You", 0, "Savings");
        savings1.displaySavingsDetails();


        //Object for Employee and Manager Class
        Employee e1 = new Employee(1, "Cashier", 50000);
        e1.displayDetails();

        Manager m1 = new Manager(2, "Central", 100000, "Manager");
        m1.displayDetailsWithManager();

    }
}