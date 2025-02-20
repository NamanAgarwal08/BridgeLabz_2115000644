import java.util.*;

class Employee {
    String name, department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}

public class GroupObjects {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Carol", "HR"));
        HashMap<String, ArrayList<Employee>> grouped = new HashMap<>();
        for (Employee e : employees) {
            if (!grouped.containsKey(e.department))
                grouped.put(e.department, new ArrayList<>());
            grouped.get(e.department).add(e);
        }
        System.out.println(grouped);
    }
}
