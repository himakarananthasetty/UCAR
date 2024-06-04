package Calculate;

import org.junit.Test;

import static org.junit.Assert.*;

public class FooPhysicsSphereTest {
    @Test
    public void test(){
        FooPhysicsSphere test = new FooPhysicsSphere();
        double result = test.sphereVolume(6);
        assertEquals(904.77868, result, 1e-3);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testZeroRadius() {
        FooPhysicsSphere test = new FooPhysicsSphere();
        test.sphereVolume(0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeRadius() {
        FooPhysicsSphere test = new FooPhysicsSphere();
        test.sphereVolume(-1);
    }
}