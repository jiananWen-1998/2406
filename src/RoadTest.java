import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RoadTest {
    Road road = new Road("0", 1, 5, new int[]{0, 0});

    @Test
    public void getId() {
        assertEquals("road_0", road.getId());
    }

    @Test
    public void getSpeedLimit() {
        assertEquals(1, road.getSpeedLimit());
    }

    @Test
    public void getLength() {
        assertEquals(5, road.getLength());
    }

    @Test
    public void getStartLocation() {
        int[] expected = {0, 0};
        assertArrayEquals(expected, road.getStartLocation());
    }

    @Test
    public void getEndLocation() {
        int[] expected = {5, 0};
        assertArrayEquals(expected, road.getEndLocation());
    }

    @Test
    public void getCars() {
        ArrayList<Car> expected = new ArrayList<>();
        assertEquals(expected, road.getCarsOnRoad());
    }

    @Test
    public void getLights() {
        ArrayList<TrafficLight> expected = new ArrayList<>();
        assertEquals(expected, road.getLightsOnRoad());
    }

    @Test
    public void getConnectedRoads() {
        ArrayList<Road> expected = new ArrayList<>();
        assertEquals(expected, road.getConnectedRoads());
    }
}