package ArchitectoryHW3.DIP;

/**
 * Абстрактный(общий) класс для всех жидкостей
 */
public abstract class Liquid {
    private final String nameLiquid;

    public Liquid(String name) {
        this.nameLiquid = name;
    }
    public abstract String dateManufacture();

    @Override
    public String toString() {
        return String.format("%s", nameLiquid);
    }
}
