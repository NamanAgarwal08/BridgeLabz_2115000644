class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Teaches: " + subject);
    }
}

class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

// Main class
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("ABC", 35, "Mathematics");
        Student student = new Student("DEF", 16, 10);
        Staff staff = new Staff("GHI", 40, "Administration");

        teacher.displayDetails();
        teacher.displayRole();
        System.out.println();

        student.displayDetails();
        student.displayRole();
        System.out.println();

        staff.displayDetails();
        staff.displayRole();
    }
}
