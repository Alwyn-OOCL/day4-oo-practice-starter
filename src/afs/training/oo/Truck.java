package afs.training.oo;

public class Truck {

    public static final int ACCELERATION = 2;
    private String name;

    private Integer speed;

    public Truck(String name, Integer speed) {
        this.name = name;
        this.speed = speed;
    }

    public void speedUp() {
        speed += ACCELERATION;
        System.out.println(name + ": speed up to " + speed + " km/h");
    }
}
