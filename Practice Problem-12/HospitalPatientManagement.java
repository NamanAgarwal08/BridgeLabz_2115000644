abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    
    public abstract double calculateBill();
    
    public int getAge() {
        return age;
    }
    
    public String getPatientDetails() {
        return name + " (ID: " + patientId + ")";
    }
}

interface MedicalRecord {
    void addRecord();

    void viewRecords();
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient patient = new Patient("P123", "John Doe", 30) {
            public double calculateBill() {
                return 500;
            }
        };
        System.out.println(patient.getPatientDetails() + " - Bill: $" + patient.calculateBill());
    }
}