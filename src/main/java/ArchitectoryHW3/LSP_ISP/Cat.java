package ArchitectoryHW3.LSP_ISP;
/**
 * Данный клас определяет конкретный тип животного - Кот и расширяется используя интерфейсы
 */
public class Cat extends Animal implements Soundable, SpeedMoving{

    public Cat(String name) {
        super(name);
    }
    // реализация абстрактного метода из абстрактного класса Animal
    @Override
    public String moving() {
        return "Бегает";
    }
    // реализация метода из интерфейса Soundable
    @Override
    public String getSound() {
        return "Мяу";
    }
    // реализация метода из интерфейса SpeedMoving
    @Override
    public int getSpeedMooving() {
        return 40;
    }
}
