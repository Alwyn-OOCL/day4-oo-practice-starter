package afs.training.oo;

public class Bus {
    private String name;

    private Integer speed;

    public Bus(String name, Integer speed) {
        this.name = name;
        this.speed = speed;
    }

    public void speedUp() {
        speed += 5;
        System.out.println(name + ": speed up to " + speed + " km/h");
    }
}
