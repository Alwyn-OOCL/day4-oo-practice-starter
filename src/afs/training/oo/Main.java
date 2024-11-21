package afs.training.oo;

public class Main {
    public static void main(String[] args) {
        Bus coolBusWithElectricEngine = new Bus("Cool Bus", 25, new Engine("Electric Engine", 5));
        Driver coolBusWithElectricDriver = new Driver(coolBusWithElectricEngine);
        coolBusWithElectricDriver.drive();

        Bus coolBusWithGasolineEngine = new Bus("Cool Bus", 20, new Engine("Gasoline Engine", 2));
        Driver coolBusWithGasolineDriver = new Driver(coolBusWithGasolineEngine);
        coolBusWithGasolineDriver.drive();

        Truck bigTruck = new Truck("Big Truck", 20);
        Driver bigTruckDriver = new Driver(bigTruck);
        bigTruckDriver.drive();
    }
}