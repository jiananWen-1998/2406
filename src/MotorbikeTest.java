import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MotorbikeTest {
    Motorbike bike = new Motorbike("0");

    @Test
    public void getLength() {
        assertEquals(0.5, bike.getLength());
    }

    @Test
    public void getId() {
        assertEquals("bike_0", bike.getId());
    }

    @Test
    public void testInheritance() {
        assertEquals(0, bike.getSpeed());
        assertEquals(1, bike.getPosition());
    }
}