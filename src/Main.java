// Import the FooPhysicsSphere class from the Calculate package

import Calculate.FooPhysicsSphere;

// Importing necessary packages from java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        // User Input to enter the radius of the sphere

        double radius = scanner.nextDouble();
        scanner.close();

        try {
            // Calculate the volume of the sphere using the sphereVolume method from FooPhysicsSphere
            double volume = FooPhysicsSphere.sphereVolume(radius);
            // Print the volume of the sphere
            System.out.println("The volume of the sphere with radius " + radius + " is: " + volume);
        } catch (IllegalArgumentException e) {
            // Exception Handling the case where the sphereVolume method throws an IllegalArgumentException
            System.out.println("Error: " + e.getMessage());
        }
    }
}