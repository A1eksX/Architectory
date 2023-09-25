package ArchitectoryHW2.fabric;

public abstract class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }
}

class Truck extends Car implements type{
    public Truck(String name) { //конструктор
        super(name);
    }
    @Override
    public String typeAuto() {
        System.out.println("Truck");
        return "Truck";
    }

    @Override
    public String toString() {
        return String.format("Вы создали: %s", typeAuto());
    }
}
class Bus extends Car implements type{
    public Bus(String name) {   //конструктор
        super(name);
    }

    @Override
    public String typeAuto() {
        System.out.println("Bus");
        return "Bus";
    }
    @Override
    public String toString() {
        return String.format("Вы создали: %s", typeAuto());
    }
}
class Bike extends Car implements type{
    public Bike(String name) {  //конструктор
        super(name);
    }

    @Override
    public String typeAuto() {
        System.out.println("Bike");
        return "Bike";
    }
    @Override
    public String toString() {
        return String.format("Вы создали: %s", typeAuto());
    }
}


