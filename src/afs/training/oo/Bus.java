package afs.training.oo;

public class Bus {

    public static final int ACCELERATION = 5;
    private String name;

    private Integer speed;

    public Bus(String name, Integer speed) {
        this.name = name;
        this.speed = speed;
    }

    public void speedUp() {
        speed += ACCELERATION;
        System.out.println(name + ": speed up to " + speed + " km/h");
    }
}
