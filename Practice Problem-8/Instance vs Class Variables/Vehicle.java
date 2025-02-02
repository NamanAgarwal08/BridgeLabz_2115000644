public class Vehicle {
    
    private String ownerName;
    private String vehicleType;

    static int registrationFee = 1000;

    //parameterized constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }


    //method for displaying details
    public void displayDetails() {
        System.out.println("Owner Name: " + this.ownerName + "\nVehicle Type: " + this.vehicleType);
    }


    //method for updating registration fee
    public static void updateRegistrationFee(int registrationFee) {
        Vehicle.registrationFee = registrationFee;
    }


    //getters and setters for instance variables
    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getVehicleType() {
        return this.vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

}
