public class Motorbike extends Car {

    private static final int i = 0;

    public Motorbike(String id) {
        super("car_" + (i + 1));
        this.id = ("bike_" + id);
        length = super.getLength() * 0.5f;
    }

}
