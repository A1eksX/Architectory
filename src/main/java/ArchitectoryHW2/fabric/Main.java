package ArchitectoryHW2.fabric;

public class Main {
    public static void main(String[] args) {
        CarsFactory car = new CarsFactory();

        Car truck = car.createCar("Truck");
        System.out.println(truck);

        Car bus = car.createCar("bus");
        System.out.println(bus);

        Car bike = car.createCar("bike");
        System.out.println(bike);
    }
}
