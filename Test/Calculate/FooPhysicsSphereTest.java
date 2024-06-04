// This package contains test classes for classes in the Calculate package

package Calculate;

import org.junit.Test;
// Import JUnit classes for testing

import static org.junit.Assert.*;

public class FooPhysicsSphereTest {
    // Test case for calculating the volume of a sphere with a positive radius .

    @Test
    public void test(){
        FooPhysicsSphere test = new FooPhysicsSphere();
        // Calculate the volume of a sphere with a radius of 6

        double result = test.sphereVolume(6);
        assertEquals(904.77868, result, 1e-3);
    }

    // Test case for zero radius input (expected to throw IllegalArgumentException).

    @Test(expected = IllegalArgumentException.class)
    public void testZeroRadius() {
        FooPhysicsSphere test = new FooPhysicsSphere();
        test.sphereVolume(0);
    }
    // Test case for negative radius input (expected to throw IllegalArgumentException).

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeRadius() {
        FooPhysicsSphere test = new FooPhysicsSphere();
        test.sphereVolume(-1);
    }
}