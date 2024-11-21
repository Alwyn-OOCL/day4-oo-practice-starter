package afs.training.oo;

public abstract class Vehicle {

    protected String name;

    protected Integer speed;

    protected Integer acceleration;

    protected String getName() {
        return name;
    }

    protected Integer getSpeed() {
        return speed;
    }

    protected Integer getAcceleration() {
        return acceleration;
    }

    protected void setSpeed(Integer speed) {
        this.speed = speed;
    }

    protected Vehicle(String name, Integer speed, Integer acceleration) {
        this.name = name;
        this.speed = speed;
        this.acceleration = acceleration;
    }

    protected abstract void speedUp();

}
