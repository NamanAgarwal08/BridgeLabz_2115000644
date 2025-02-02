public class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    public void displayPGDetails() {
        System.out.println("Roll Number: " + rollNumber);

        System.out.println("Name: " + name); // Accessing protected member

        System.out.println("Specialization: " + specialization);

        System.out.println("CGPA: " + getCgpa()); // Using getter for private member
    }
}