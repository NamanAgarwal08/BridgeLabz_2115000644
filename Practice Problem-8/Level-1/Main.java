public class Main {
    public static void main(String[] args) {
        
        //Object for Book Class
        Book b1 = new Book();
        b1.displayDetails();

        Book b2 = new Book("Hello Hii", "Naman", 1000);
        b2.displayDetails();


        //Object for Circle Class
        Circle c1 = new Circle();
        c1.printArea();

        Circle c2 = new Circle(2.2);
        c2.printArea();


        //Object for Person Class
        Person p1 = new Person();
        p1.displayDetails();

        Person p2 = new Person("Hello", 20);
        p2.displayDetails();

        Person p3 = new Person(p2);
        p3.displayDetails();


        //Object for HotelBooking Class
        HotelBooking h1 = new HotelBooking();
        h1.displayDetails();

        HotelBooking h2 = new HotelBooking("Hiii", "Normal", 2);
        h2.displayDetails();

        HotelBooking h3 = new HotelBooking(h2);
        h3.displayDetails();


        //Object for Library Class
        Library l1 = new Library();
        l1.displayDetails();

        Library l2 = new Library("ABC", "abc", 10, true);
        l2.displayDetails();

        l2.borrowBook();

        //Object for CarRental Class
        CarRental car1 = new CarRental("Me", "Car", 2);
        car1.displayDetails();
        car1.totalCost();

    }
}
