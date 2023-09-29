package ArchitectoryHW3.LSP_ISP;
/**
 * Данный клас определяет конкретный тип животного - Ворон и расширяется используя интерфейсы
 */
public class Сrow extends Animal implements Soundable, SpeedMoving{
    public Сrow(String name) {
        super(name);
    }
    // реализация абстрактного метода из абстрактного класса Animal
    @Override
    public String moving() {
        return "Летает";
    }
    // реализация метода из интерфейса Soundable
    @Override
    public String getSound() {
        return "Кар-Кар";
    }
    // реализация метода из интерфейса SpeedMoving
    @Override
    public int getSpeedMooving() {
        return 80;
    }
}
