package Calculate;

public class FooPhysicsSphere {
    public static double sphereVolume(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be a positive number.");
        }
//        return (4.0 / 3.0) *Math.PI* radius*radius*radius;
        return (4.0 / 3.0) *Math.PI* Math.pow(radius, 3);
    }
}