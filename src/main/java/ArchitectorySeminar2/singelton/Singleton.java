package ArchitectorySeminar2.singelton;
/*
паттерн Одиночка, его суть в том, что можно создать ТОЛЬКО один экземпляр класса.
Если попытаться сделать ещё один, то это будет уже ссылка на первый экземпляр класса.
 */
public class Singleton {

    // Приватное статическое поле для хранения единственного экземпляра класса
    private static Singleton instance;

    // Приватный конструктор, чтобы предотвратить создание экземпляров извне
    private Singleton() {
        // Инициализация
    }

    // Публичный статический метод для получения экземпляра Singleton
    public static Singleton getInstance() {
        // Если экземпляр ещё не создан, создаем его
        if (instance == null) {
            instance = new Singleton();
        }
        // Возвращаем единственный экземпляр
        return instance;
    }

    // Другие методы и поля класса

    public void doSomething() {
        System.out.println("Вызван метод doSomething()");
    }
}
