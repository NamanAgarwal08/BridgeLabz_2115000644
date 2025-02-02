public class Main {
    public static void main(String[] args) {
        
        //Object for Product Class
        Product p1 = new Product("null", 0);

        p1.displayProductDetails();
        Product.displayTotalProducts();


        //Object for Course Class
        Course c1 = new Course("ABC", 3, 2000);
        c1.displayCourseDetails();
        
        Course.updateInstituteName("New Name");
        System.out.println(Course.instituteName);

        //Object for Vehicle Class
        Vehicle v1 = new Vehicle("Name", "4 Wheeler");
        v1.displayDetails();

        Vehicle.updateRegistrationFee(2000);

    }
}
