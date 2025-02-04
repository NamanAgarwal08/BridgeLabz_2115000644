class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Kushagra Sharma", 58982);
        b1.bankName = "SBI";
        b1.getTotalAccounts(b1);
        System.out.println(b1.bankName);
        System.out.println(b1.accountHolderName);
        System.out.println(b1.accountNumber);
        BankAccount b2 = new BankAccount("Naman Agarwal", 98273);
        b2.getTotalAccounts(b2);
        System.out.println(b2.bankName);
        System.out.println(b2.accountHolderName);
        System.out.println(b2.accountNumber);

        Book b11 = new Book("Harry Potter", "J.K Rowling", 4325);
        Book b12 = new Book("Marvel", "Stan Lee", 5648);
        b11.libraryName = "Library Of Gurgaon";
        b11.displayLibraryName(b11);
        System.out.println(b11.title);
        System.out.println(b11.author);
        System.out.println(b11.isbn);
        b12.displayLibraryName(b12);
        System.out.println(b12.title);
        System.out.println(b12.author);
        System.out.println(b12.isbn);

        Employee e1 = new Employee("Kushagra Sharma", 1234, "SDE1");
        Employee e2 = new Employee("Naman Agarwal", 4335, "SDE2");
        System.out.println(e1.name);
        System.out.println(e1.id);
        System.out.println(e1.designation);
        System.out.println(e2.name);
        System.out.println(e2.id);
        System.out.println(e2.designation);

        Product p1 = new Product("Maggi", 12, 50, 756);
        Product p2 = new Product("chips", 10, 45, 435);
        p1.displayDetails(p1);
        p2.updateDiscount(25);
        p2.displayDetails(p2);

        Student s1 = new Student("Aviral Bindal", 12, "A");
        Student s2 = new Student("Kushagra Sharma", 45, "O");
        s1.displayDetails(s1);
        s1.displayTotalStudents(s1);
        s2.displayDetails(s2);
        s2.displayTotalStudents(s2);

        Vehicle v1 = new Vehicle("Kushagra Sharma", "4 wheeler", 4235);
        Vehicle v2 = new Vehicle("Naman Agarwal", "2 wheeler", 3423);
        v1.displayDetails(v1);
        v1.updateRegistrationFee(2000);
        v2.displayDetails(v2);

        Patient pa1 = new Patient("Naman Agarwal", 29, "Hot Water", 1234);
        Patient pa2 = new Patient("Kushagra Gupta", 27, "Ginger Tea", 4352);
        pa1.displayDetails(pa1);
        pa1.getTotalPatients(pa1);
        pa2.displayDetails(pa2);
    }

}