package ArchitectoryHW3.DIP;
/**
 * Класс определяет тип жидкости - молоко
 */
public class Milk extends Liquid {
    public Milk(String name) {
        super(name);
    }
    // реализуем метод dateManufacture() под данный класс
    @Override
    public String dateManufacture() {
        return "29.02";
    }
}
