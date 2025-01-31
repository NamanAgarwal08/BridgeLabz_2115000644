public class Main {
    public static void main(String[] args) {

        //Object for Employee Class
        Employee e1 = new Employee("Naman", 1, 10000000);
        e1.displayDetails();

        System.out.println("Name: " + e1.getName());
        System.out.println("Id: " + e1.getId());
        System.out.println("Salary: " + e1.getSalary());

        e1.setName("Agarwal");
        e1.setId(11);
        e1.setSalary(20000000);

        System.out.println("Updates Details:");
        e1.displayDetails();


        //Object for Circle Class
        Circle c1 = new Circle(1.1);
        c1.printArea();
        c1.printCircumference();
        System.out.println(c1.getRadius());
        
        c1.setRadius(2.2);
        System.out.println("Updated area and circumference:");
        c1.printArea();
        c1.printCircumference();
        

        //Object for Book Class
        Book b1 = new Book("Meri Book", "Naman", 1000);
        b1.displayDetails();

        System.out.println("Title: " + b1.getTitle());
        System.out.println("Author: " + b1.getAuthor());
        System.out.println("Price: " + b1.getPrice());

        b1.setTitle("Meri Dusri Book");
        b1.setAuthor("Agarwal");
        b1.setPrice(2000);

        System.out.println("Updates Details:");
        b1.displayDetails();
        
    }
}
