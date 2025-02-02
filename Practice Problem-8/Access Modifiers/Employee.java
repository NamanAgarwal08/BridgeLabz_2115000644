public class Employee {
    
    public int employeeId;
    protected String department;
    private int salary;

    public Employee(int employeeId, String department, int salary) {
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Id: " + this.employeeId);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: " + this.salary);
    }

    // getter and setter
    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
