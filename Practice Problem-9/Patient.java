class Patient {
    static String hospitalName = "Rainbow Hospital";
    String name;
    int age;
    String ailment;
    final int patientID;
    private static int totalPatients;

    Patient() {
        this("default", 19, "unknown", 0000);
    }

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients(Object b) {
        if (b instanceof Patient)
            System.out.println("The Total number of patients are : " + totalPatients);
        else
            System.out.println("Not an instance of class Patient");
    }

    void displayDetails(Object b) {
        if (b instanceof Patient) {
            System.out.println("Name of the Hospital is : " + hospitalName);
            System.out.println("Name of the Patient is : " + name);
            System.out.println("Age of the patient is : " + age);
            System.out.println("Ailment for the patient is : " + ailment);
            System.out.println("Patient Id is : " + patientID);
        } else
            System.out.println("Not an instance of class Patient");
    }
}