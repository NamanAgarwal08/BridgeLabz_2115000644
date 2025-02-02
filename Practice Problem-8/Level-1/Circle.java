public class Circle {
    
    private double radius;


    //default consturctor
    public Circle() {
        this(1.1);
    }
    
    //parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public void printArea() {
        System.out.println("Area: " + (3.14 * radius * radius));
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}