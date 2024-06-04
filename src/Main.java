import Calculate.FooPhysicsSphere;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();
        scanner.close();

        try {
            double volume = FooPhysicsSphere.sphereVolume(radius);
            System.out.println("The volume of the sphere with radius " + radius + " is: " + volume);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}