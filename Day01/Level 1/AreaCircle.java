// Class to represent a Circle
class Circle {

    double radius; // Radius of the circle
    double area;   // Area of the circle

    // Constructor to initialize the circle with a given radius
    Circle(double radius) {
        this.radius = radius; // Assign the radius value
    }

    // Method to calculate the area of the circle
    public void calculateArea() {
        area = 3.14 * radius * radius; // Formula for the area of a circle: π * r^2
    }

    // Method to display the area of the circle
    public void display() {
        System.out.println("Area of the Circle is " + area);
    }
}

// Main class to test the Circle class
public class AreaCircle {

    public static void main(String[] args) {

        // Create a Circle object with a radius of 3
        Circle circle = new Circle(3);

        // Calculate the area of the circle
        circle.calculateArea();

        // Display the area of the circle
        circle.display();
    }
}
