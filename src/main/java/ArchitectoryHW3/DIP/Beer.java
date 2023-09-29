package ArchitectoryHW3.DIP;

/**
 * Класс определяет тип жидкости - пиво
 */
public class Beer extends Liquid{
    public Beer(String name) {
        super(name);
    }
    // реализуем метод dateManufacture() под данный класс
    @Override
    public String dateManufacture() {
        return "10.01";
    }
}
