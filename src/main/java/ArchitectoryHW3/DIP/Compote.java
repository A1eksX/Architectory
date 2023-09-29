package ArchitectoryHW3.DIP;
/**
 * Класс определяет тип жидкости - компот
 */
public class Compote extends Liquid{
    public Compote(String name) {
        super(name);
    }
    // реализуем метод dateManufacture() под данный класс
    @Override
    public String dateManufacture() {
        return "21.05";
    }
}
