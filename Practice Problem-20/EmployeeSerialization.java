import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name, department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }
}

public class EmployeeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        processEmployees();
    }

    static void processEmployees() throws IOException, ClassNotFoundException {
        List<Employee> employees = Arrays.asList(new Employee(1, "ABC", "HR", 50000));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"));
        oos.writeObject(employees);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.dat"));
        System.out.println(ois.readObject());
        ois.close();
    }
}
