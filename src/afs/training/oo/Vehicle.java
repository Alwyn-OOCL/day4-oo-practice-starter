package afs.training.oo;

public abstract class Vehicle {

    protected String name;

    protected Integer speed;

    protected Engine engine;

    protected String getName() {
        return name;
    }

    protected Integer getSpeed() {
        return speed;
    }

    public Engine getEngine() {
        return engine;
    }

    protected void setSpeed(Integer speed) {
        this.speed = speed;
    }

    protected Vehicle(String name, Integer speed, Engine engine) {
        this.name = name;
        this.speed = speed;
        this.engine = engine;
    }

    protected Vehicle(String name, Integer speed) {
        this.name = name;
        this.speed = speed;
    }

    protected Vehicle() {
    }

    protected abstract void speedUp();

}
