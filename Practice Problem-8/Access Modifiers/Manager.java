public class Manager extends Employee {

    public String managerName;

    public Manager(int employeeId, String department, int salary, String managerName) {
        super(employeeId, department, salary);
        this.managerName = managerName;
    }

    public void displayDetailsWithManager() {
        
        System.out.println("Employee Id: " + this.employeeId); //public
        
        System.out.println("Department: " + this.department); // accessing protected instance

        System.out.println("Salary: " + getSalary()); // accessing salary through getter method

        System.out.println("Manager Name: " + this.managerName); // public
    }
    
}
