import java.util.Date; // Import date module
import java.util.Scanner; // For inputs

public class CircleDemo {
    public static void main(String[] args) {
        // Date
        Date date = new Date();                       
        System.out.println(date.toString());          
        // Variables
        double rds;                                                // To hold the radius input
        try (// Create scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in)) {
            // Ask user to input radius
            System.out.print("\nPlease enter radius of the circle: ");
            rds = keyboard.nextDouble();
        }
        // Create objects
        Circle circle = new Circle(rds);
        // Display data using getter methods
        System.out.printf("\nThe circle's area is: " +  String.format("%.2f", circle.getArea()) +
        "\nThe circle's diameter is: " + String.format("%.2f", circle.getDiameter()) + "\nThe circle's circumference is: " +
        String.format("%.2f", circle.getCircumference()) + "\n\n");
    }
}