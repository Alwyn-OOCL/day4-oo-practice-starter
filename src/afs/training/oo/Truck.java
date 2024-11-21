package afs.training.oo;

public class Truck extends Vehicle {

    public Truck(String name, Integer speed, Integer acceleration) {
        super(name, speed, acceleration);
    }

    @Override
    public void speedUp() {
        this.setSpeed(this.getSpeed() + this.getAcceleration());
        System.out.println(name + ": speed up to " + speed + " km/h");
    }
}
