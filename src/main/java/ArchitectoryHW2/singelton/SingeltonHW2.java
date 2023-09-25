package ArchitectoryHW2.singelton;

import ArchitectorySeminar2.singelton.Singleton;

public class SingeltonHW2 {
    // Приватное статическое поле для хранения единственного экземпляра класса
    private static SingeltonHW2 instance;

    // Приватный конструктор, чтобы предотвратить создание экземпляров извне
    private SingeltonHW2() {
    }

    // Публичный статический метод для получения экземпляра Singleton
    public static SingeltonHW2 getInstance() {
        // Если экземпляр ещё не создан, создаем его
        if (instance == null) {
            instance = new SingeltonHW2();
        }
        // Возвращаем единственный экземпляр
        return instance;
    }

    // Другие методы и поля класса

    public void doSomething() {
        System.out.println("Вызван метод doSomething()");
    }
}
