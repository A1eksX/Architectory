package ArchitectoryHW2.fabric;

public class CarsFactory {
    public Car createCar(String auto){
        if ("Truck".equalsIgnoreCase(auto)){
            return new Truck("Truck");
        }
        else if ("Bus".equalsIgnoreCase(auto)) {
            return new Bus("Bus");
        } else if ("Bike".equalsIgnoreCase(auto)) {
            return new Bike("Bike");
        }
        else {
            throw new IllegalArgumentException("такого транспорта нет");
        }
    }
}
