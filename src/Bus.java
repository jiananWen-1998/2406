public class Bus extends Car {

    public Bus(String id, int i) {
        super("car_" + (i + 1));
        this.id = ("bus_" + id);
        length = super.getLength() * 3;
    }

}
