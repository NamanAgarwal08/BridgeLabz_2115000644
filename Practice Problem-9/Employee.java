class Employee {
    static String companyName = "CAPGEMINI";
    String name;
    final int id;
    String designation;
    private static int totalEmployee;

    Employee() {
        this("default", 0000, "unknown");
    }

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployee++;
    }

    static void displayTotalEmployees(Object b) {
        if (b instanceof Employee)
            System.out.println("The total number of employees are : " + totalEmployee);
        else
            System.out.println("Not an instance of Employee class");
    }

}