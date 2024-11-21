package afs.training.oo;

public class Truck extends Vehicle {

    private static final Integer ACCELERATION = 2;

    public Truck(String name, Integer speed) {
        super(name, speed);
    }

    @Override
    public void speedUp() {
        this.setSpeed(this.getSpeed() + ACCELERATION);
        System.out.println(name + ": speed up to " + speed + " km/h");
    }
}
