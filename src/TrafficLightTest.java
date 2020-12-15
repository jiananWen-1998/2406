import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrafficLightTest {
    Road road = new Road("0", 1, 5, new int[]{0, 0});
    TrafficLight light = new TrafficLight("0", road);

    @Test
    public void testOperate() {
        light.operate(3515);
        assertEquals("green", light.getState());
    }

    @Test
    public void getState() {
        assertEquals("red", light.getState());
    }

    @Test
    public void getRoad() {
        assertEquals(road, light.getRoadAttachedTo());
    }

    @Test
    public void getPosition() {
        assertEquals(5, light.getPosition());
    }

    @Test
    public void getId() {
        assertEquals("light_0", light.getId());
    }

}