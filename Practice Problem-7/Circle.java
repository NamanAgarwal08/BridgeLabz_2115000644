public class Circle {
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void printArea() {
        System.out.println("Area: " + (3.14 * radius * radius));
    }

    public void printCircumference() {
        System.out.println("Circumference: " + ((double) 2 * 3.14 * radius));
    }
    
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}