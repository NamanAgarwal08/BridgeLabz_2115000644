class Vehicle {
    static int registrationFee = 1000;
    String ownerName;
    String vehicleType;
    final int registrationNumber;

    Vehicle() {
        this("default", "unknown", 0000);
    }

    Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }

    void displayDetails(Object b) {
        if (b instanceof Vehicle) {
            System.out.println("Registration Fee is : " + registrationFee);
            System.out.println("Owner Name is : " + ownerName);
            System.out.println("Vehicle Type is : " + vehicleType);
            System.out.println("Registration Number is : " + registrationNumber);
        } else
            System.out.println("Not an instance of Vehicle");
    }

}