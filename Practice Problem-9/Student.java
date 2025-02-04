class Student {
    static String universityName = "GLA UNIVERSITY";
    String name;
    final int rollNumber;
    String grade;
    private static int totalStudent;

    Student() {
        this("default", 123, "Z");
    }

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudent++;
    }

    static void displayTotalStudents(Object b) {
        if (b instanceof Student)
            System.out.println("Total number of students are : " + totalStudent);
        else
            System.out.println("Not an instance of Student class");
    }

    void displayDetails(Object b) {
        if (b instanceof Student) {
            System.out.println("Name of the university is :" + universityName);
            System.out.println("Name of the Student is : " + name);
            System.out.println("Roll number of Student is :" + rollNumber);
            System.out.println("Grade of the Student is :" + grade);
        } else
            System.out.println("Not an instance of Student");

    }

}