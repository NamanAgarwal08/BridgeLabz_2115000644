public class CarRental {

    private String customerName;
    private String carModel;
    private int rentalDays;
    private int cost;

    // parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.cost = 500;
    }

    public void displayDetails() {
        System.out.println("Customer Name: " + customerName + "\nCar Model: " + carModel + "\nRental Days: "
                + rentalDays + "\nTotal Cost: " + (rentalDays * this.cost));
    }

    public void totalCost() {
        System.out.println("Total Cost: " + (this.rentalDays * this.cost));
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCarModel() {
        return this.carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getRentalDays() {
        return this.rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

}