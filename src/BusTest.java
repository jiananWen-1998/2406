import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BusTest {
    Road road = new Road("0", 1, 5, new int[]{0, 0});
    private int i;
    Bus bus = new Bus("0", i);

    @Test
    public void getLength() {
        assertEquals(3, bus.getLength());
    }

    @Test
    public void getId() {
        assertEquals("bus_0", bus.getId());
    }

    @Test
    public void testInheritance() {
        assertEquals(0, bus.getSpeed());
        assertEquals(1, bus.getPosition());
    }
}