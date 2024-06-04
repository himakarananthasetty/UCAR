// This package contains classes for performing physics calculations

package Calculate;

public class FooPhysicsSphere {
    public static double sphereVolume(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be a positive number.");
        }
        // Calculate the volume using the formula 4/3 * pi * r^3

        // return (4.0 / 3.0) *Math.PI* radius*radius*radius;
        return (4.0 / 3.0) *Math.PI* Math.pow(radius, 3);
    }
}