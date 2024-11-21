package afs.training.oo;

public class Main {
    public static void main(String[] args) {
        Bus coolBus = new Bus("Cool Bus", 25, 5);
        Driver coolBusDriver = new Driver(coolBus);
        coolBusDriver.drive();

        Truck bigTruck = new Truck("Big Truck", 20, 2);
        Driver bigTruckDriver = new Driver(bigTruck);
        bigTruckDriver.drive();
    }
}