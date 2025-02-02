public class Person {
    
    private String name;
    private int age;

    //default Constructor
    public Person() {
        this("Unknown", 22);
    }

    //parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Copy Constructor
    public Person(Person p2) {
        this.name = p2.name;
        this.age = p2.age;
    }

    public void displayDetails() {
        System.out.println("Name : " + this.name + "\nAge: " + this.age);

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
