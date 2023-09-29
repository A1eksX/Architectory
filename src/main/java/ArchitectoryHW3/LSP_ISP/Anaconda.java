package ArchitectoryHW3.LSP_ISP;
/**
 * Данный клас определяет конкретный тип животного - Анаконда и расширяется используя интерфейсы
 */
public class Anaconda extends Animal implements Soundable, SpeedMoving{

    public Anaconda(String name) {
        super(name);
    }
    // реализация абстрактного метода из абстрактного класса Animal
    @Override
    public String moving() {
        return "Ползает";
    }
    // реализация метода из интерфейса Soundable
    @Override
    public String getSound() {
        return "Ш-ш-ш-ш-ш";
    }
    // реализация метода из интерфейса SpeedMoving
    @Override
    public int getSpeedMooving() {
        return 15;
    }
}
