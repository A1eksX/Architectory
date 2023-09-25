package ArchitectoryHW2.singelton;

import ArchitectorySeminar2.singelton.Singleton;

public class Main {
    public static void main(String[] args) {
        // Получаем экземпляр Singleton
        SingeltonHW2 singleton = SingeltonHW2.getInstance();

        // Вызываем методы
        singleton.doSomething();
    }
}
