package afs.training.oo;

public class Engine {

    private String name;

    private Integer acceleration;

    public Engine(String name, Integer acceleration) {
        this.name = name;
        this.acceleration = acceleration;
    }

    public Integer getAcceleration() {
        return acceleration;
    }
}
