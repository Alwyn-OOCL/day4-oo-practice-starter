package afs.training.oo;

public class Bus extends Vehicle {

    public Bus(String name, Integer speed, Engine engine) {
        super(name, speed, engine);
    }

    @Override
    public void speedUp() {
        this.setSpeed(this.getSpeed() + this.getEngine().getAcceleration());
        System.out.println(name + ": speed up to " + speed + " km/h");
    }
}
