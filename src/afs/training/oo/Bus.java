package afs.training.oo;

public class Bus extends Vehicle {

    public Bus(String name, Integer speed, Integer acceleration) {
        super(name, speed, acceleration);
    }

    @Override
    public void speedUp() {
        this.setSpeed(this.getSpeed() + this.getAcceleration());
        System.out.println(name + ": speed up to " + speed + " km/h");
    }
}
