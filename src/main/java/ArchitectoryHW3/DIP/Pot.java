package ArchitectoryHW3.DIP;
/**
 * Класс - бутылка.
 * Использование типа переменной Liquid в поле (private Liquid nameLiquid) даёт возможность избежать жёсткого
 * привязывания конкретной жидкости к классу Pot(бутылка), тем самым, позволяя использовать любой тип жидкости
 */
public class Pot {
    private final Liquid nameLiquid;

    public Pot(Liquid nameLiquid) {
        this.nameLiquid = nameLiquid;
    }

    @Override
    public String toString() {
        return String.format("В бутылке налито: %s", nameLiquid);
    }
}
